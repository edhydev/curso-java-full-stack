package com.cursojava.curso.controllers;

import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Edgar");
        user.setSurnames("Jiménez");
        user.setEmail("edhy.mxm@gmail.com");
        user.setPhone("0123456789");
        user.setUsername("edhymx1");
        user.setPassword("password");

        return user;
    }

    @RequestMapping(value = "user")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Edgar");
        user1.setSurnames("Jiménez");
        user1.setEmail("edhy.mxm@gmail.com");
        user1.setPhone("0123456789");
        user1.setUsername("edhymx1");
        user1.setPassword("password");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Luis");
        user2.setSurnames("Escamilla");
        user2.setEmail("luis.mxm@gmail.com");
        user2.setPhone("0123456789");
        user2.setUsername("luismx1");
        user2.setPassword("password");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Cesar");
        user3.setSurnames("Rubio");
        user3.setEmail("cesar.mxm@gmail.com");
        user3.setPhone("0123456789");
        user3.setUsername("cesarmx1");
        user3.setPassword("password");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
