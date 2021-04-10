package com.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class Controlador {
	
	@Autowired
	private RestTemplate restRespuesta;

	private final String direccion = "https://jsonplaceholder.typicode.com/users";


	@RequestMapping("/")
	public String vistaPrincipal(Model modelo) {
		
		Usuarios[] listaUsuarios = restRespuesta.getForObject(direccion, Usuarios[].class);
		
		for (Usuarios usuario: listaUsuarios) {
			System.out.println(usuario);
		}
		
		modelo.addAttribute("listaUsuarios", listaUsuarios);
		
		return "index";
	}
	
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public Usuarios consumeUser(@PathVariable Integer id) {
		String url = direccion + "/{id}";
		return restRespuesta.getForObject(url, Usuarios.class, id);
	}

	@GetMapping("/users")
	@ResponseBody
	public Usuarios[] consultarUsuarios() {
		return restRespuesta.getForObject(direccion, Usuarios[].class);

	}
	
}
