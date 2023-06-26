package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-de-aprendizagem")

public class ObjetivoDeAPrendizagem {

	@GetMapping
	public String helloWorld() {
		return "Aprender mais Mysql, Aprender mais sobre Spring boot";
	}
}
