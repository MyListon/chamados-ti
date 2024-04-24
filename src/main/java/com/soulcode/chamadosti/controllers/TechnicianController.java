package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.models.Chamado;
import com.soulcode.chamadosti.models.Tecnico;
import com.soulcode.chamadosti.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TechnicianController {

    @Autowired
    private CallRepository repo;

    @GetMapping("/login-tecnico")
    public String login() {
        return "login-tecnico";
    }

    @PostMapping("/autenticar-tecnico")
    public String autenticarTecnico(@RequestParam String usuarioTecnico, @RequestParam String senhaTecnico) {
        Tecnico tecnicoAutenticacao = new Tecnico();
        tecnicoAutenticacao.setLogin(usuarioTecnico);
        tecnicoAutenticacao.setSenha(senhaTecnico);
        if ("root".equals(tecnicoAutenticacao.getLogin()) && "root".equals(tecnicoAutenticacao.getSenha())) {
            return "redirect:/tela-tecnico";
        } else {
            return "login-tecnico";
        }
    }

    @GetMapping("/tela-tecnico")
    public String telaTecnico(Model model) {
        List<Chamado> chamadosAbertos = repo.findAllByAtendido(false);
        List<Chamado> chamadosAtendidos = repo.findAllByAtendido(true);
        model.addAttribute("chamadosAbertos", chamadosAbertos);
        model.addAttribute("chamadosAtendidos", chamadosAtendidos);
        return "tela-tecnico";
    }

}
