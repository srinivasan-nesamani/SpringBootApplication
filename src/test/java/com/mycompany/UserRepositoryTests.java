//package com.mycompany;
//
//import com.mycompany.user.User;
//import com.mycompany.user.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.*;
//import static org.junit.Assert.*;
//import org.junit.jupiter.api.Assertions;
//
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//public class UserRepositoryTests {
//    @Autowired private UserRepository repo;
//
//    @Test
//    public void testAddNew(){
//        User user = new User();
//        user.setEmail("srinivasan@gmail.com");
//        user.setPassword("srini1234");
//        user.setFirstName("Srini");
//        user.setLastName("Vasan");
//
//        User savedUser = repo.save(user);
//
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser).getId().isGreaterThan(0);
//    }
//    @Test
//    public void testListAll(){
//        Iterable<User> users = repo.findAll();
//        Assertions.assertThat(users).hasSizeGreaterThan(0);
//
//    }
//}
