package com.example.demo.dao;

import com.example.demo.models.Facultate;
import com.example.demo.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FacultateDao {

    @PersistenceContext
    public EntityManager entityManager;

    public List<Facultate> getAll() {

        return entityManager.createQuery("from Facultate").getResultList();
    }

    public Facultate getById(int id) {
        return (Facultate) entityManager.createQuery(
                "from Sala where id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    public Facultate getByNume(String nume) {
        return (Facultate) entityManager.createQuery(
                "from Facultate where nume = :nume")
                .setParameter("nume", nume)
                .getSingleResult();
    }

}