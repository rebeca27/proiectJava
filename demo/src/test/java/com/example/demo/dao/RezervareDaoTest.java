//package com.example.demo.dao;
//
//import com.example.demo.models.Rezervare;
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
//class RezervareDaoTest {
//
//    @InjectMocks
//    RezervareDao rezervareDao;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAllBookingsWithID() {
//        List<Rezervare> result = rezervareDao.getAllBookingsWithID(0);
//        Assertions.assertEquals(Arrays.<Rezervare>asList(new Rezervare(0, 0, null, null, "motiv")), result);
//    }
//
//    @Test
//    void testMakeBooking() {
//        rezervareDao.makeBooking(new Rezervare(0, 0, null, null, "motiv"));
//    }
//
//    @Test
//    void testGetAll() {
//        List<Rezervare> result = rezervareDao.getAll();
//        Assertions.assertEquals(Arrays.<Rezervare>asList(new Rezervare(0, 0, null, null, "motiv")), result);
//    }
//
//    @Test
//    void testUpdateSalaStatus() {
//        rezervareDao.updateSalaStatus();
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme