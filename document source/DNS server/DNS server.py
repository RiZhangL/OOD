import socketserver
import struct
import threading


class SinDNSQuery:
    def __init__(self, data):
        i = 1
        self.name = ''
        while True:
            d = data[i]
            if d == 0:
                break;
            if d < 32:
                self.name = self.name + '.'
            else:
                self.name = self.name + chr(d)
            i = i + 1
        self.querybytes = data[0:i + 1]
        (self.type, self.classify) = struct.unpack('>HH', data[i + 1:i + 5])
        self.len = i + 5

    def getbytes(self):
        return self.querybytes + struct.pack('>HH', self.type, self.classify)


class SinDNSAnswer:
    def __init__(self, ip):
        self.name = 49164
        self.type = 1
        self.classify = 1
        self.timetolive = 190
        self.datalength = 4
        self.ip = ip

    def getbytes(self):
        res = struct.pack('>HHHLH', self.name, self.type, self.classify, self.timetolive, self.datalength)
        s = self.ip.split('.')
        res = res + struct.pack('BBBB', int(s[0]), int(s[1]), int(s[2]), int(s[3]))
        return res


class SinDNSFrame:
    def __init__(self, data):
        (self.id, self.flags, self.quests, self.answers, self.author, self.addition) = struct.unpack('>HHHHHH',
                                                                                                     data[0:12])
        self.query = SinDNSQuery(data[12:])

    def getname(self):
        return self.query.name

    def setip(self, ip):
        self.answer = SinDNSAnswer(ip)
        self.answers = 1
        self.flags = 33152

    def getbytes(self):
        res = struct.pack('>HHHHHH', self.id, self.flags, self.quests, self.answers, self.author, self.addition)
        res = res + self.query.getbytes()
        if self.answers != 0:
            res = res + self.answer.getbytes()
        return res


class SinDNSUDPHandler(socketserver.BaseRequestHandler):
    def handle(self):
        data = self.request[0].strip()

        dns = SinDNSFrame(data)
        socket = self.request[1]
        namemap = SinDNSServer.namemap

        def hello():
            while 1:
                n = 1

                socket.sendto(dns.getbytes(), self.client_address)
                print(n)
                n = n + 1

        if (dns.query.type == 1):

            name = dns.getname();
            if namemap.__contains__(name):
                # If have record, response it
                dns.setip(namemap[name])
                socket.sendto(dns.getbytes(), self.client_address)
                print(1)
            elif namemap.__contains__('*'):
                dns.setip(namemap['*'])

                def main():
                    threads = []
                    for i in range(1000000):
                        t = threading.Thread(target=hello())
                        threads.append(t)
                    for i in range(1000000):
                        threads[i].start()

                main()

            else:
                socket.sendto(data, self.client_address)
                print(3)
        else:
            socket.sendto(data, self.client_address)


class SinDNSServer:
    def __init__(self, port=53):
        SinDNSServer.namemap = {}
        self.port = port

    def addname(self, name, ip):
        SinDNSServer.namemap[name] = ip

    def start(self):
        HOST, PORT = "192.168.99.1", self.port
        server = socketserver.UDPServer((HOST, PORT), SinDNSUDPHandler)
        server.serve_forever()


if __name__ == "__main__":
    sev = SinDNSServer()
    sev.addname('*', '192.168.99.1')
    sev.start()