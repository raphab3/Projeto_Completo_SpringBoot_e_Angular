package com.algaworks.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.vendas.model.Venda;
import com.algaworks.vendas.repository.Vendas;


@RestController
@RequestMapping("/vendas")
public class VendasResource {
	
	@Autowired
	private Vendas vendas;
	
	@GetMapping
	public List<Venda> listar(){
		return vendas.findAll();
	} 
}
