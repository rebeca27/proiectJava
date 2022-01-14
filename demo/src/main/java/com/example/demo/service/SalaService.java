package com.example.demo.service;

import com.example.demo.models.Sala;
import com.example.demo.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

public class SalaService {

    @Autowired
    SalaRepository salaRepository;

        @Transactional
    public void saveSala(Sala sala) {
        Optional<Sala> existingSala = salaRepository.findByName(sala.getNume());
        if (existingSala.isPresent()) {
            throw SalaException.classroomWithSameNameAlreadyExists();
        }
        try {
            salaRepository.save(sala);
        } catch (RuntimeException e) {
            if (e instanceof SalaException) {
                throw e;
            } else {
                throw SalaException.classroomCouldNotBeSaved();
            }
        }
    }
}
