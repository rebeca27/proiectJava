package com.example.demo.repository;

import com.example.demo.models.Rezervare;
import com.example.demo.models.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RezervareRepository extends JpaRepository<Rezervare,Integer> {

    Optional<Rezervare> findById(int id);
}