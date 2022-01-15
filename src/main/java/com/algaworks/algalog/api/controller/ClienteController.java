package com.algaworks.algalog.api.controller;


import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;



@AllArgsConstructor
@RestController
public class ClienteController {
	
	//@Autowired injetar com anotação ou com lonbok
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteRepository.findByNomeContaining("Moi");
	}
	
	
	
	
	

}
