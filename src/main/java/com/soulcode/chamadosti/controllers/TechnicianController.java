package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.repositories.TechnicianRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecnicos")
public class TechnicianController {
    private final TechnicianRepository technicianRepository;

    public TechnicianController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    // Métodos para manipulação de técnicos
}
