package com.example.demo.repository;

import com.example.demo.models.Facultate;
import com.example.demo.models.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultateRepository extends JpaRepository<Facultate,Integer> {

//Optional<Facultate> findAllByUser(int id);
}