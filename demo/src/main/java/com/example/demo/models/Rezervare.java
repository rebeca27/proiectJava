package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Rezervare")
public class Rezervare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NotNull
    int id_sala;
    @NotNull
    int id_user;
    @NotNull
    Timestamp start;
    @NotNull
    Timestamp finish;
    @NotNull
    String motiv;
    @NotNull
    int estimat_rezervare;

    public Rezervare() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rezervare rezervare = (Rezervare) o;
        return id == rezervare.id && id_sala == rezervare.id_sala && id_user == rezervare.id_user && estimat_rezervare == rezervare.estimat_rezervare && start.equals(rezervare.start) && finish.equals(rezervare.finish) && motiv.equals(rezervare.motiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_sala, id_user, start, finish, motiv, estimat_rezervare);
    }

    public Rezervare(int id_sala, int id_user, Timestamp start, Timestamp finish, String motiv) {
        this.id_sala = id_sala;
        this.id_user = id_user;
        this.start = start;
        this.finish = finish;
        this.motiv = motiv;
        this.estimat_rezervare = (int) ((this.getFinish().getTime() - this.getStart().getTime()) / 60000);
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

    public Date getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Timestamp finish) {
        this.finish = finish;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public int getEstimat_rezervare() {

        return estimat_rezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", id_sala=" + id_sala +
                ", id_user=" + id_user +
                ", start=" + start +
                ", finish=" + finish +
                ", motiv='" + motiv + '\'' +
                ", estimat_rezervare=" + estimat_rezervare +
                '}';
    }
}
