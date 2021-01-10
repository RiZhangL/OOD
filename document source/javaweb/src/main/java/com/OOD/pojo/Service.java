package com.OOD.pojo;

public class Service {
    private int id;
    private int station_id;
    private String service_name;
    private String service_detail;
    private String service_pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_detail() {
        return service_detail;
    }

    public void setService_detail(String service_detail) {
        this.service_detail = service_detail;
    }

    public String getService_pic() {
        return service_pic;
    }

    public void setService_pic(String service_pic) {
        this.service_pic = service_pic;
    }

    public Service(int id, int station_id, String service_name, String service_detail, String service_pic) {
        this.id = id;
        this.station_id = station_id;
        this.service_name = service_name;
        this.service_detail = service_detail;
        this.service_pic = service_pic;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", station_id=" + station_id +
                ", service_name='" + service_name + '\'' +
                ", service_detail='" + service_detail + '\'' +
                ", service_pic='" + service_pic + '\'' +
                '}';
    }

    public Service(){
        super();
        // TODO Auto-generated constructor stub
    }
}
