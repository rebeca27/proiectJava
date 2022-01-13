//package com.example.demo.dao;
//
//import com.example.demo.models.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import javax.persistence.EntityManager;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//class UserDaoTest1 {
//    @Mock
//    EntityManager entityManager;
//    @InjectMocks
//    UserDao userDao;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAll() {
//        List<User> result = userDao.getAll();
//        Assertions.assertEquals(Arrays.<User>asList(new User("nume", "prenume", true, "mail", "parola", 0)), result);
//    }
//
//    @Test
//    void testGetByNume() {
//        User result = userDao.getByNume("nume");
//        Assertions.assertEquals(new User("nume", "prenume", true, "mail", "parola", 0), result);
//    }
//
//    @Test
//    void testGetById() {
//        User result = userDao.getById(0);
//        Assertions.assertEquals(new User("nume", "prenume", true, "mail", "parola", 0), result);
//    }
//
//    @Test
//    void testGetMailPassword() {
//        User result = userDao.getMailPassword("mail", "parola");
//        Assertions.assertEquals(new User("nume", "prenume", true, "mail", "parola", 0), result);
//    }
//
//    @Test
//    void testHasRights() {
//        boolean result = userDao.hasRights(0);
//        Assertions.assertEquals(true, result);
//    }
//
//    @Test
//    void testUpdateUser() {
//        userDao.updateUser(new User("nume", "prenume", true, "mail", "parola", 0));
//    }
//
//    @Test
//    void testGetFaculty() {
//        List<String> result = userDao.getFaculty(0);
//        Assertions.assertEquals(Arrays.<String>asList("String"), result);
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme