package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping(value = "api/user")
    public List<User> getAllUsers() {
        return usuarioDao.getUsers();
    }

    @GetMapping(value = "api/user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Edgar");
        user.setSurnames("Jiménez");
        user.setEmail("edhy.mxm@gmail.com");
        user.setPhone("0123456789");
        user.setPassword("password");

        return user;
    }

    @PostMapping(value = "api/user")
    public void getUser(@RequestBody User user) {
        System.out.println(user.toString());
        usuarioDao.register(user);
    }

    @DeleteMapping(value = "api/user/{id}")
    public void remove(@PathVariable Long id) {
        usuarioDao.delete(id);
    }
}
