package com.soulcode.chamadosti.repositories;

import com.soulcode.chamadosti.models.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository extends JpaRepository<Chamado, Long> {
    // Métodos de consulta personalizados, se necessário
}
