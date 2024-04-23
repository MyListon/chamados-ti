package com.soulcode.chamadosti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CallController {

    @GetMapping("/tela-chamado")
    public String atualizarChamado() {
        return "tela-tecnico";
    }

    @PostMapping("/salvar-chamado")
    public String criarChamado() {
        return "salvar-chamado";
    }
    // Métodos para manipulação de chamados
}
