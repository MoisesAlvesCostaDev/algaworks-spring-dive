package com.algaworks.algalog.api.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;



 
@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("moi.ac@hotmail.com");
		cliente1.setTelefone("37 988275555");
		cliente1.setNome("João");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("cliente2@hotmail.com");
		cliente2.setTelefone("37 21313221");
		cliente2.setNome("Cliente 2");
		
		
		return Arrays.asList(cliente1,cliente2);		
	}
	
	
	
	
	

}
