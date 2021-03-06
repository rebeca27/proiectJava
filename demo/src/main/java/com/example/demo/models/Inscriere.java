package com.example.demo.models;

import javax.validation.constraints.NotNull;

public class Inscriere {

    @NotNull
    public int id_sala;

    @NotNull
    public int id_user;


    public Inscriere(){
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
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
                "id_sala=" + id_sala +
                ", id_user='" + id_user + '\'' +
                '}';
    }
}
