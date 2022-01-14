package com.example.demo.repository;

import com.example.demo.models.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaRepository extends JpaRepository<Sala,Integer> {

    Optional<Sala> findById(int id);

    Optional<Sala> findByName(String nume);
}

