package com.example.demo.dao;

import com.example.demo.models.Inscriere;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class InscriereDao {
    @PersistenceContext
    public EntityManager entityManager;

    public List<Inscriere> getAll() {

        return entityManager.createQuery("from inscriere").getResultList();
    }
}