package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Represents an User for this web application.
 */
@Entity
@Table(name = "Facultate")
public class Facultate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull
    public String nume;

    public Facultate() {
    }

    public Facultate(int id) {
        this.id = id;
    }


    public Facultate(String nume) {
        this.nume = nume;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
