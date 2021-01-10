package com.OOD.pojo;

public class Location {
    private int id;
    private int station_id;
    private String location;

    public Location(int id, int station_id, String location) {
        this.id = id;
        this.station_id = station_id;
        this.location = location;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", station_id=" + station_id +
                ", location='" + location + '\'' +
                '}';
    }

    public Location() {
        super();
        // TODO Auto-generated constructor stub
    }
}
