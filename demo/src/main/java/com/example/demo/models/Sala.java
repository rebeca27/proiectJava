package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an User for this web application.
 */
@Entity
@Table(name = "Sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull
    public String nume;

    @NotNull
    public String descriere;

    @NotNull
    public boolean stare;

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    public Sala() {
    }

    public Sala(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return id == sala.id && stare == sala.stare && nume.equals(sala.nume) && descriere.equals(sala.descriere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume, descriere, stare);
    }

    public Sala(String nume, String descriere, boolean stare) {
        this.nume = nume;
        this.descriere = descriere;
        this.stare = stare;
    }


    public String getNume() { return nume; }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public boolean getStare() {
        return stare;
    }

    public void setStare(boolean stare) {
        this.stare = stare;
    }

    public int getId() {
        return id;
    }

   // public int setId() this.id = id;}

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", stare=" + stare +
                '}';
    }
}