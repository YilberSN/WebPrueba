package com.proyecto;

//Entidad que modela los usuarios del servicio rest
public class Usuarios {
	
	//Las variables deben corresponder a las key del Json que retorna el rest
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: "+ name + "<br>email=" + email + "<br> Telefono=" + phone + "<br> Pagina Web=" + website + "";
	}
	
	
	

}
