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
	
	//Se utliza la libreria RestTemplate para poder consumir el servicio Rest
	@Autowired
	private RestTemplate restRespuesta;
	private final String direccion = "https://jsonplaceholder.typicode.com/users";

	//Ruta principal para cargar la pagina web index
	@RequestMapping("/")
	public String vistaPrincipal(Model modelo) {
		
		//Se realiza el consumo del servicio Rest y se almacen el json de 
		//respuesta en un vector de obtetos tipo Usuarios con los datos a mapear
		Usuarios[] listaUsuarios = restRespuesta.getForObject(direccion, Usuarios[].class);
		
		//Impresión por consola para validar la respuesta y los datos del servicio Rest
		for (Usuarios usuario: listaUsuarios) {
			System.out.println(usuario);
		}
		
		//Se agregan al modelo la lista de usuarios obtenidos a traves de la peticion
		//al servicio rest de la pagina jsonplaceholder con el fin de ser accesibles 
		//en la vista y mostrarlos en el slider
		modelo.addAttribute("listaUsuarios", listaUsuarios);
		
		//Se genera un vector con las rutas de las imagenes de perfil de las personas
		//ya que el servicio rest no devulve este parametro, se simula para tener las
		//fotos de perfil y mostrarlas de tal manera a la plantilla enviada
		String[] foto = {"imagenes/img1.jpg","imagenes/img2.jpg","imagenes/img3.jpg",
						 "imagenes/img2.jpg","imagenes/img3.jpg","imagenes/img1.jpg",
						 "imagenes/img3.jpg","imagenes/img1.jpg","imagenes/img2.jpg"};
		modelo.addAttribute("foto", foto);
		
		//Para el fondo se realiza algo similar con el fin de variar el fondo en el
		//slider de las personas con el fin de complementar los datos
		String[] fondo = {"/imagenes/foto2.PNG","/imagenes/foto1.PNG","",
						  "","/imagenes/foto2.PNG","/imagenes/foto1.PNG",
						  "/imagenes/foto2.PNG","","/imagenes/foto1.PNG"};
		modelo.addAttribute("direccion", fondo);
		//Se regresa la pagina web index
		return "index";
	}
	
	//Url de pruebas para validar el consumo del api rest jsonplaceholder, de vuleve solo un usuario
	@GetMapping("/usuario/{id}")
	@ResponseBody
	public Usuarios consumeUser(@PathVariable Integer id) {
		String url = direccion + "/{id}";
		return restRespuesta.getForObject(url, Usuarios.class, id);
	}
	
	//Url de pruebas para validar el consumo del api rest jsonplaceholder, de vuleve todos los usuarios
	@GetMapping("/usuarios")
	@ResponseBody
	public Usuarios[] consultarUsuarios() {
		return restRespuesta.getForObject(direccion, Usuarios[].class);
	}
	
}
