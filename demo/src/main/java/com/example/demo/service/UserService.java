//package com.example.demo.service;
//
//import com.example.demo.models.Facultate;
//import com.example.demo.models.User;
//import com.example.demo.repository.FacultateRepository;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.transaction.Transactional;
//import java.util.Optional;
//
//
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private FacultateRepository facultateRepository;
//
////    @Transactional
////    public void saveUser(User user) {
////        Optional<User> existingUser = userRepository.findByMail(user.getMail());
////        if (existingUser.isPresent()) {
////            throw UserException.userWithSameEmailAlreadyExists();
////        }
////        try {
////            userRepository.save(user);
////        } catch (RuntimeException e) {
////            if (e instanceof UserException) {
////                throw e;
////            } else {
////                throw UserException.accountCouldNotBeSaved();
////            }
////        }
////    }
////
////    public Optional<Facultate> getUserAccounts(int id) {
////         if (userRepository.findById_facultate(id) == facultateRepository.findAllByUser(id))
////             return facultateRepository.findAllByUser(id);
////        return null;
////    }
//}
