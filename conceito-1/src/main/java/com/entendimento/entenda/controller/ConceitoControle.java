package com.entendimento.entenda.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TesteApi")
public class ConceitoControle {
	
	@GetMapping
	public String retornandoString () {
		return "As APIs são um conjunto de padrões que fazem parte de uma interface.";
	}
	
	@GetMapping("/1")
	public String retornandoStringExemplosApi () {
		return " Pode ser usados para pagamentos bem como: Cielo, PagSeguro";
	}
	
	@PostMapping
	public String post (@RequestBody String texto) {
		
		/*
		 * Aplicado regras de negocio
		 * 
		 * armazenar em um banco de dados
		 * 
		 * mandar para outra api
		 * 
		 * mandar outras informações via EMAIL SMS, WhatsApp xpto
		 * 
		 * */
		System.out.println(texto);
		
		return texto;
	}
	
	@PutMapping
	public String put (@RequestBody String texto) {
		
		/*
		 * Aplicado regras de negocio
		 * 
		 * armazenar em um banco de dados
		 * 
		 * mandar para outra api
		 * 
		 * mandar outras informações via EMAIL SMS, WhatsApp xpto
		 * 
		 * */
		System.out.println(texto);
		
		return texto;
	}
	
	@PatchMapping
	public String patch (@RequestBody String texto) {
		
		/*
		 * Aplicado regras de negocio
		 * 
		 * armazenar em um banco de dados
		 * 
		 * mandar para outra api
		 * 
		 * mandar outras informações via EMAIL SMS, WhatsApp xpto
		 *
		 * */
		System.out.println(texto);
		
		return texto;
	}
	
	@DeleteMapping
	public String deletando () {
		return "Deletando algo";
	}
	
}
