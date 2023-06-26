package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generation-bsm")

public class GenerationBsms {

	@GetMapping
	public String helloWorld() {
		return "Mentalidade de Crescimento, Persistencia, Responsabilidade Pessoal, Orientação do Futuro, Comunicação, Orientação ao Detalhe, Proatividade. Trabalho em Equipe";
	}
	
} 