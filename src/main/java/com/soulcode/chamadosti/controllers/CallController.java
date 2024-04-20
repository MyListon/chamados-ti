package com.soulcode.chamadosti.controllers;

import com.soulcode.chamadosti.repositories.CallRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chamados")
public class CallController {
    private final CallRepository callRepository;

    public CallController(CallRepository callRepository) {
        this.callRepository = callRepository;
    }

    // Métodos para manipulação de chamados
}
