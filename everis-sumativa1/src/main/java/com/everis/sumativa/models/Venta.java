package com.everis.sumativa.models;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String idUsuario;
	private String listaProductos;
	private String fecha;

	public Venta() {}
	





	public Venta(String idUsuario, String listaProductos, String fecha) {
		super();
		this.idUsuario = idUsuario;
		this.listaProductos = listaProductos;
		this.fecha = fecha;
	}






	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}






	public String getListaProductos() {
		return listaProductos;
	}





	public void setListaProductos(String listaProductos) {
		this.listaProductos = listaProductos;
	}






	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
}
