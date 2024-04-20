package com.soulcode.chamadosti.repositories;

import com.soulcode.chamadosti.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    // Métodos de consulta personalizados, se necessário
}