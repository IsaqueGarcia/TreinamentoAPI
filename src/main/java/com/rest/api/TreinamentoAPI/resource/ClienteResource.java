package com.rest.api.TreinamentoAPI.resource;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.TreinamentoAPI.domain.Cliente;

public interface ClienteResource extends JpaRepository<Cliente, Integer> {

}
