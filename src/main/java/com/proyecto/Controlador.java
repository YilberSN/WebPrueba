package com.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	

	@RequestMapping("/")
	public String vistaPrincipal(Model modelo) {
		return "index";
	}
	
}
