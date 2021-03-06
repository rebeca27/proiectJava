package com.example.demo.controllers;

import com.example.demo.dao.RezervareDao;
import com.example.demo.dao.SalaDao;
import com.example.demo.dao.UserDao;
import com.example.demo.models.Rezervare;
import com.example.demo.models.Sala;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MainController {

    @Autowired
    private SalaDao salaDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private RezervareDao rezervareDao;

    @GetMapping("/login")
    public List<User> getAllUsers() {
        rezervareDao.updateSalaStatus();
        return userDao.getAll();
    }

    @GetMapping("/sali")
    public List<Sala> getAllRooms() {
        rezervareDao.updateSalaStatus();
        return salaDao.getAll();
    }

    @GetMapping("/facultate")
    public List<String> getAllFaculties(@RequestParam("id") int id) {
        return userDao.getFaculty(id);
    }


    @RequestMapping("/istoric")
    public List<Rezervare> getRoomHistory(@RequestParam int id) {
        rezervareDao.updateSalaStatus();
        return rezervareDao.getAllBookingsWithID(id);
    }

    @PostMapping("/new_booking")
    public void makeBooking(@RequestParam int id_sala, @RequestParam int id_user, @RequestParam String start, @RequestParam String finish, String motiv) {
        Rezervare rezervare = new Rezervare(id_sala, id_user, Timestamp.valueOf(start), Timestamp.valueOf(finish), motiv);
        rezervareDao.updateSalaStatus();
        rezervareDao.makeBooking(rezervare);
        rezervareDao.updateSalaStatus();
    }

    @PostMapping("/register")
    public void registerUser(@RequestParam String nume,@RequestParam String prenume, @RequestParam boolean permisiune, @RequestParam String mail, @RequestParam String parola,@RequestParam int id_facultate) {
        User user = new User(nume, prenume, permisiune, mail, parola,id_facultate);
        userDao.updateUser(user);
    }

    @PostMapping("/new_classroom")
    public void registerClassroom(@RequestParam String nume,@RequestParam String descriere, @RequestParam boolean stare) {
        Sala sala = new Sala(nume, descriere, stare);
        salaDao.updateClassroom(sala);
    }

}
