package com.example.demo.repository;

import com.example.demo.models.Facultate;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    Optional<User> findById(int id);
    Optional<User> findByName(String nume);
    Optional<User> findByMailAnAndParola(String mail, String parola);
    Optional<User> findByMail(String mail);
    Optional<Facultate> findById_facultate(int id_facultate);

}
