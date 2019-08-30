package com.rest.api.TreinamentoAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.TreinamentoAPI.domain.Cliente;
import com.rest.api.TreinamentoAPI.service.ClienteService;

@RestController
@RequestMapping(value = "/apiCliente")
public class ClienteController {
	
	@Autowired
	 ClienteService service;
	
	@GetMapping(value = "/Cliente")
	public List<Cliente> consultaCliente(){
		return service.consultaCliente();
	}
	
	@GetMapping(value = "/Cliente/{id}")
	public Optional<Cliente> consultaClienteId(@PathVariable Integer id, Cliente cliente) {
		return service.consultaClienteId(id, cliente);
	}
	
	@PostMapping(value = "/Cliente")
	public Cliente insereCliente(@RequestBody Cliente cliente) {
		return service.insereCliente(cliente);
	}
	
	@PutMapping(value = "/Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return service.atualizaCliente(cliente);
	}
	
	@DeleteMapping(value = "/Cliente/{id}")
	public void deletaCliente(@PathVariable Integer id) {
		service.deletaCliente(id);
	}
}
