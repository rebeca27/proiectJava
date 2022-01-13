package com.example.demo.models;

import javax.validation.constraints.NotNull;

public class Attendee {
    @NotNull
    public int id_user;

    @NotNull
    public int id_facultate;

    public Attendee(){
    }

    public int getId_facultate() {
        return id_facultate;
    }

    public void setId_facultate(int id_facultate) {
        this.id_facultate = id_facultate;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "id_facultate=" + id_facultate +
                ", id_user='" + id_user + '\'' +
                '}';
    }
}
