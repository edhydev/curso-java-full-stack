package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        user.setUsername("edhymx1");
        user.setPassword("password");

        return user;
    }

    @DeleteMapping(value = "api/user/{id}")
    public void remove(@PathVariable Long id) {
        usuarioDao.delete(id);
    }
}
