package com.proyecto;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuracion {
	
	@Bean
	public RestTemplate restRespuesta(RestTemplateBuilder builder) {
		return builder.build();
	}
	
}
