package com.OOD.pojo;

public class Facility {
    private int id;
    private int Station_id;
    private String facility_name;
    private String facility_detail;
    private String facility_pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStation_id() {
        return Station_id;
    }

    public void setStation_id(int station_id) {
        Station_id = station_id;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public String getFacility_detail() {
        return facility_detail;
    }

    public void setFacility_detail(String facility_detail) {
        this.facility_detail = facility_detail;
    }

    public String getFacility_pic() {
        return facility_pic;
    }

    public void setFacility_pic(String facility_pic) {
        this.facility_pic = facility_pic;
    }

    public Facility() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Facility(int id, int station_id, String facility_name, String facility_detail, String facility_pic) {
        this.id = id;
        Station_id = station_id;
        this.facility_name = facility_name;
        this.facility_detail = facility_detail;
        this.facility_pic = facility_pic;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", Station_id=" + Station_id +
                ", facility_name='" + facility_name + '\'' +
                ", facility_detail='" + facility_detail + '\'' +
                ", facility_pic='" + facility_pic + '\'' +
                '}';
    }
}
