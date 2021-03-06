package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NotNull
    String nume;
    @NotNull
    String prenume;
    @NotNull
    boolean permisiune;
    @NotNull
    String mail;
    @NotNull
    String parola;
    @NotNull
    int id_facultate;

    public User(String nume, String prenume, boolean permisiune, String mail, String parola, int id_facultate ){
        this.nume = nume;
        this.prenume = prenume;
        this.permisiune = permisiune;
        this.mail = mail;
        this.parola = parola;
        this.id_facultate = id_facultate;
    }

    public User() {
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public boolean getPermisiune() {
        return permisiune;
    }

    public void setPermisiune(boolean permisiune) {
        this.permisiune = permisiune;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getId_facultate() {
        return id_facultate;
    }

    public void setId_facultate(int id_facultate) {
        this.id_facultate = id_facultate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", permisiune=" + permisiune +
                ", mail='" + mail + '\'' +
                ", parola='" + parola + '\'' +
                ", id_facultate='" + id_facultate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && permisiune == user.permisiune && id_facultate == user.id_facultate && nume.equals(user.nume) && prenume.equals(user.prenume) && mail.equals(user.mail) && parola.equals(user.parola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume, prenume, permisiune, mail, parola, id_facultate);
    }
}
