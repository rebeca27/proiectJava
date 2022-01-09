package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Represents an User for this web application.
 */
@Entity
@Table(name = "Inscriere")
public class Inscriere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public Inscriere() {
    }

    public Inscriere(int id, String descriere, boolean stare) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                '}';
    }
}
