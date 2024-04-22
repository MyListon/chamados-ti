package com.soulcode.chamadosti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/login-usuario")
    public String login() {
        return "login-usuario";
    }

    @PostMapping("/autenticar-usuario")
    public String autenticarUsuario(String username, String password) {
        if ("root".equals(username) && "root".equals(password)) {
            return "redirect:/tela-usuario";
        } else {
            return "redirect:/usuario";
        }
    }

    @GetMapping("/tela-usuario")
    public String telaUsuario() {
        return "tela-usuario";
    }

    @GetMapping("/criar-chamado")
    public String cadastrarChamado() {
        return "criar-chamado";
    }
}
