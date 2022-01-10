package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "attendee",
            joinColumns = @JoinColumn(name = "id_facultate"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    private Set<User> faculties;

    public Facultate() {
    }

    public Facultate(int id) {
        this.id = id;
    }

    public Facultate(String nume) { this.nume = nume; }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Set<User> getFaculties() { return faculties; }

    public void addFaculty(User faculty) { faculties.add(faculty); }

    public void removeFaculty(User faculty) { faculties.remove(faculty); }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
