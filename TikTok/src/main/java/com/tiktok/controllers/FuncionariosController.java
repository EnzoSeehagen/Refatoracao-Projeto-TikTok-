package com.tiktok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionariosController {
	
	@RequestMapping("/DadosFuncionarios")
	public String form() {
		return "formFuncionarios";
	}
}
