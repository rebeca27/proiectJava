package com.example.demo.dao;

import com.example.demo.models.Attendee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AttendeeDao{
        @Autowired
        public EntityManager entityManager;

        public List<Attendee> getAll() {

            return entityManager.createQuery("from Attendee").getResultList();
        }
}
