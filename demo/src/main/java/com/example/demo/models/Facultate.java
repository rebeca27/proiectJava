package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "Facultate")
public class Facultate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facultate facultate = (Facultate) o;
        return id == facultate.id && nume.equals(facultate.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }

    @NotNull
    public String nume;

    public Facultate() {
    }

    public Facultate(int id) {
        this.id = id;
    }

    public Facultate(String nume) { this.nume = nume; }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
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
