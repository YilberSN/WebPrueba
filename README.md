# Prueba Frontend

Esta es una prueba tecnica de frontend para evaluar:

###1. Diseño de interfaces
#####1.1. Implementación y construcción de Scss
#####1.2. Implementación y construcción de Html
#####1.3 Buenas prácticas y reutilización de Styles
	
###2. Desarrollo Frontend - Angular
#####2.1. Construcción del proyecto en angular
#####2.2. Creación de componentes
#####2.3 Buenas prácticas de desarrollo
#####2.4 Consumir servicio REST

###3. Manejo de git
#####3.1 Subir el proyecto a un repositorio git

#Descripción del desarrollo

El proyecto esta desarrollado en el Framework Spring Boot 2.4.4.

##Contrucción
1. Se utilizo el contenido assets suministrados en el archivo zip.
2. Se utilizo CSS y bootstrap para el estilo de la pagina web.
3. Se utilizo la fuente
[Fuente source sans pro](https://fonts.google.com/specimen/Source+Sans+Pro)
4. Mejoras UX:
Considero que la pagina principal debia estar segmentada y separar las laminas interactivas de costos en otra pagina, y el slider en otra pagina o sección de personal, esto con el fin de no saturar el cliente en una extensa pagina web.

5. Se consumio el servicio 
[jsonplaceholder](http://jsonplaceholder.typicode.com/)
mediante el controlador de java utilizando la libreria RestTemplate de Spring Boot, se agregaron 2 url de pruebas para validar el consumo del api rest en:
[http://localhost:8081/usuario/1](http://localhost:8081/usuario/1) y 
[http://localhost:8081/usuarios/](http://localhost:8081/usuarios/)
se obtuvieron los clientes disponibles y se enviaron a la vista, donde se insertaron en el slider de personas.

6. Durante el desarrollo de esta prueba se realizan diferentes sincronizaciones a GitHub.


## License
Uso Academico y de ejemplo para cualquier persona que la requiera.