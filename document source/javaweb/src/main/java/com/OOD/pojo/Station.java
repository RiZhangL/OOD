package com.OOD.pojo;

public class Station {
    private int id;
    private String station_name;
    private String station_line;
    private String start_time;
    private String end_time;
    private String starting_station;
    private String terminal_station;

    public int getId() {
        return id;
    }

    public String getStation_name() {
        return station_name;
    }

    public String getStation_line() {
        return station_line;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getStarting_station() {
        return starting_station;
    }

    public String getTerminal_station() {
        return terminal_station;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setStation_line(String station_line) {
        this.station_line = station_line;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setStarting_station(String starting_station) {
        this.starting_station = starting_station;
    }

    public void setTerminal_station(String terminal_station) {
        this.terminal_station = terminal_station;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", station_name='" + station_name + '\'' +
                ", station_line='" + station_line + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", starting_station='" + starting_station + '\'' +
                ", terminal_station='" + terminal_station + '\'' +
                '}';
    }

    public Station(int id, String station_name, String station_line, String start_time, String end_time, String starting_station, String terminal_station) {
        this.id = id;
        this.station_name = station_name;
        this.station_line = station_line;
        this.start_time = start_time;
        this.end_time = end_time;
        this.starting_station = starting_station;
        this.terminal_station = terminal_station;
    }

    public Station() {
        super();
        // TODO Auto-generated constructor stub
    }
}
