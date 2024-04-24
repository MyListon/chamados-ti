package com.soulcode.chamadosti.repositories;

import com.soulcode.chamadosti.models.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CallRepository extends JpaRepository<Chamado, Long> {
    List<Chamado> findAllByAtendido(boolean atendido);

}
