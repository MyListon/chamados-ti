package com.soulcode.chamadosti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TechnicianController {

    @GetMapping("/login-tecnico")
    public String login() {
        return "login-tecnico";
    }

    @PostMapping("/autenticar-tecnico")
    public String autenticarTecnico(String username, String password) {
        if ("root".equals(username) && "root".equals(password)) {
            return "tela-tecnico";
        } else {
            return "login-tecnico";
        }
    }

    @GetMapping("/tela-tecnico")
    public String telaTecnico() {
        return "tela-tecnico";
    }

    @GetMapping("/tela-chamado1")
    public String atualizarChamado() {
        return "tela-chamado1";
    }
    @GetMapping("/tela-chamado2")
    public String atualizarChamado2() {
        return "tela-chamado2";
    }
    @GetMapping("/tela-chamado3")
    public String atualizarChamado3() {
        return "tela-chamado1";
    }
    @GetMapping("/tela-chamado4")
    public String atualizarChamado4() {
        return "tela-chamado4";
    }
    @GetMapping("/tela-chamado5")
    public String atualizarChamado5() {
        return "tela-chamado5";
    }
}
