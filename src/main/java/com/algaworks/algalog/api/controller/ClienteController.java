package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.catalina.Manager;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
 
@RestController
public class ClienteController {
	
	
	@PersistenceContext
	private EntityManager manager;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {	
		return manager.createQuery("from Cliente", Cliente.class).getResultList();	
	}

}
