package com.rest.api.TreinamentoAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.api.TreinamentoAPI.domain.Cliente;
import com.rest.api.TreinamentoAPI.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	@GetMapping(value = "/Cliente")
	public List<Cliente> consultaCliente(){
		return repo.findAll();
	}
	
	@GetMapping(value = "/Cliente/{id}")
	public Optional<Cliente> consultaClienteId(@PathVariable Integer id, Cliente cliente) {
		return repo.findById(id);
	}
	
	@PostMapping(value = "/Cliente")
	public Cliente insereCliente(@RequestBody Cliente cliente) {
		return repo.save(cliente);
	}
	
	@PutMapping(value = "/Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return repo.save(cliente);
	}
	
	@DeleteMapping(value = "/Cliente/{id}")
	public void deletaCliente(@PathVariable Integer id) {
		repo.deleteById(id);
	}
	
	
	
}
