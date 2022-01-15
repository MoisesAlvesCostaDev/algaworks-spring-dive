package com.algaworks.algalog.api.controller;


import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;



 
@RestController
public class ClienteController {
	
	
	@PersistenceContext // injeção
	private EntityManager manager;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
	
			return manager.createQuery("from Cliente",Cliente.class).getResultList();
		
	}
	
	
	
	
	

}
