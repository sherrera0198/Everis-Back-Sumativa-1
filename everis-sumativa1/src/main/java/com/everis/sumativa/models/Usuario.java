package com.everis.sumativa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity ////se  trabaja como entidad en vez de objeto
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=4 , max=50)
	private String nombre;
	@Size(min=4 , max=50)
	private String password;
	@Max(150) 
	@Min(1)
	private Integer edad;
	
	
	
	
	public Usuario() {	}

	public Usuario(@Size(min = 4, max = 50) String nombre, @Size(min = 4, max = 50) String password,
			@Max(150) @Min(1) Integer edad) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.edad = edad;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
}
