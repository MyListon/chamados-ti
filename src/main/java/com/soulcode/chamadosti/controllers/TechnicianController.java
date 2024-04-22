package com.soulcode.chamadosti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TechnicianController {

    @GetMapping("/login-tecnico")
    public String login() {
        return "login-tecnico";
    }

}
