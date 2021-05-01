package com.everis.sumativa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.services.ProductoService;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiControllerProducto {

	
	@Autowired
	ProductoService productoService;
	
	
	@RequestMapping("/productos")
	public List<Producto> listaProductos(){
		
		List<Producto> productos_lista= productoService.allProducto();
		return productos_lista;
	}
	
	@RequestMapping("/productos/{id}")
	public Optional<Producto> buscarProductos(@PathVariable("id") Long id ){
		
		Optional<Producto> producto= productoService.buscarPorId(id);
		return producto;
	}
}
