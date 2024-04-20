package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.models.Usuario;
import com.soulcode.chamadosti.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)

    public Usuario save() {
        Usuario u = new Usuario();
        u.setNome("");
        this.userRepository = userRepository;
    }

    // Métodos para manipulação de usuários
}
