package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.models.Chamado;
import com.soulcode.chamadosti.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class CallController {

    @Autowired
    private CallRepository repo;

    @GetMapping("/criar-chamado")
    public String formChamado() {
        return "criar-chamado";
    }

    @PostMapping("/criar-chamado")
    public String criarChamado(@ModelAttribute Chamado chamado,
                               @RequestParam String descricao,
                               @RequestParam String setor,
                               @RequestParam String prioridade) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        chamado.setDataInicio(LocalDateTime.now());
        chamado.setDescricao(descricao);
        chamado.setSetor(setor);
        chamado.setPrioridade(prioridade);
        repo.save(chamado);
        return "redirect:/consultar-chamado";
    }

    @GetMapping("/consultar-chamado")
    public String consultarChamado(Model model) {
        List<Chamado> listarChamado = repo.findAll();
        model.addAttribute("chamados", listarChamado);
        return "consultar-chamado";
    }
}
