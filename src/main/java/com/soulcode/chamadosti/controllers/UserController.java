package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.models.Chamado;
import com.soulcode.chamadosti.models.Usuario;
import com.soulcode.chamadosti.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private CallRepository repo;

    @GetMapping("/login-usuario")
    public String login() {
        return "login-usuario";
    }

    @PostMapping("/autenticar-usuario")
    public String autenticarUsuario(@RequestParam String usuario, @RequestParam String senha, Model model) {
        Usuario usuarioAutenticacao = new Usuario();
        usuarioAutenticacao.setLogin(usuario);
        usuarioAutenticacao.setSenha(senha);

        if ("equipe6".equals(usuarioAutenticacao.getLogin()) && "equipe6".equals(usuarioAutenticacao.getSenha())) {
            List<Chamado> listarChamado = repo.findAll();
            model.addAttribute("chamados", listarChamado);
            return "tela-usuario";
        } else {
            return "login-usuario";
        }

    }

    @GetMapping("/tela-usuario")
    public String telaUsuario(Model model) {
        List<Chamado> listarChamado = repo.findAll();
        model.addAttribute("chamados", listarChamado);
        return "tela-usuario";
    }

}
