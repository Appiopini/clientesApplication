package com.github.appiopini.clientes.model.repository;

import com.github.appiopini.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Cliente, Integer> {
}
