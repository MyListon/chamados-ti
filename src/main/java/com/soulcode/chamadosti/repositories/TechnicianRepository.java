package com.soulcode.chamadosti.repositories;

import com.soulcode.chamadosti.models.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Tecnico, Long> {
    // Métodos de consulta personalizados, se necessário
}