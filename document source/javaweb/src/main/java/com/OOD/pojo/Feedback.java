package com.OOD.pojo;

public class Feedback {
    private int id;
    private String name_user;
    private String email;
    private String phone;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name_user;
    }

    public void setName(String name) {
        this.name_user = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Feedback(int id, String name, String email, String phone, String message) {
        this.id = id;
        this.name_user = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", name='" + name_user + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Feedback(String name_user, String email, String phone, String message) {
        this.name_user = name_user;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    public Feedback() {
        super();
        // TODO Auto-generated constructor stub
    }
}
