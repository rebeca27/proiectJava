//package com.example.demo.dao;
//
//import com.example.demo.models.User;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class UserDaoTest {
//
//    @Autowired
//    private UserDao userDao;
//    private User user;
//
//    @Test
//    @DisplayName("Get all users informations")
//    void getAll() {
//        List<User> user = this.userDao.getAll();
//        assertEquals(13, user.size());
//        assertEquals("Andreea", user.get(0).getNume());
//        assertEquals("Andreea", user.get(1).getNume());
//        assertEquals("Andreea", user.get(2).getNume());
//        assertEquals("Andreea", user.get(3).getNume());
//        assertEquals("Andreea", user.get(4).getNume());
//        assertEquals("Andreea", user.get(5).getNume());
//        assertEquals("Andreea", user.get(6).getNume());
//        assertEquals("Andreea", user.get(7).getNume());
//        assertEquals("Oprea", user.get(0).getNume());
//        assertEquals("Stefan", user.get(0).getNume());
//        assertEquals("Eric", user.get(0).getNume());
//        assertEquals("Ionescu", user.get(0).getPrenume());
//
//    }
//
//    @Test
//    @DisplayName("Insert user informations")
//    void updateUser() {
//
//        // arange #1
////        user = new User();
////        user.setNume("Rauch");
////        user.setPrenume("Rebecca");
////        user.setPermisiune(false);
////        user.setMail("rebecca.rauch@test.com");
////        user.setParola("t");
////        user.setId_facultate(1);
//
//        //userDao = new UserDao();
//        // arange #2
//        userDao.updateUser(new User("Rauch", "Rebecca", false, "rebecca.rauch@test.com", "t", 1));
//
//        //assert
//        assertEquals(user.getId_facultate(), userDao.getById(user.getId_facultate()));
//        assertEquals(user.getId_facultate(), userDao.getById(1));
//        assertEquals(user.getNume(), userDao.getByNume("Rauch"));
//        assertEquals(user.getNume(), userDao.getByNume(user.getNume()));
//
//    }
//
//    @Test
//    @DisplayName("Get faculty informations")
//    void getFaculty() {
//        List<User> user = this.userDao.getAll();
//        assertEquals(userDao.getFaculty(1), user.get(1).getId_facultate());
//        assertEquals(userDao.getFaculty(6), user.get(1).getId_facultate());
//        assertEquals(userDao.getFaculty(8), user.get(1).getId_facultate());
//    }
//}