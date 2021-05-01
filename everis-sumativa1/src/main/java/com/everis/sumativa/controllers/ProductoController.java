package com.everis.sumativa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa.models.Producto;

import com.everis.sumativa.services.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	///////////agregar
	
	@RequestMapping("/producto/formulario")
	public String agregarProducto (@RequestParam(value="nombre") String nombre,
			@RequestParam(value="descripcion") String descripcion ,
			@RequestParam(value="precio") int precio  , Model model) {
		
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		
		producto = productoService.guardarProducto(producto);
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos= (ArrayList<Producto>)productoService.allProducto();
		int largoLista= listaProductos.size();
		
		model.addAttribute("listaProductos" ,listaProductos);
		model.addAttribute("largoLista" ,largoLista);
		
		
		return "productoTabla.jsp";  
				
				
	}
	
	//////////eliminar	
	@RequestMapping("/eliminarProducto")
	public String eliminarProducto(@RequestParam(value="idEliminar") Long id, Model model) {
		
		String mensajeEliminado = productoService.eliminarUsuarioId(id);
		System.out.println(mensajeEliminado);
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos= (ArrayList<Producto>)productoService.allProducto();
		int largoLista= listaProductos.size();
		
		model.addAttribute("listaProductos" ,listaProductos);
		model.addAttribute("largoLista" ,largoLista);
		
		return "productoTabla.jsp";
	}
	
	

	/////////////editar
	@RequestMapping("/editarProducto")
	public String editarProductoSelect(@RequestParam(value="idEditar") Long id, Model model) {
		
		Producto producto = productoService.buscarPorId(id).get();
		model.addAttribute("producto", producto);
		System.out.println(producto.getNombre());
	
		return "productoEditar.jsp";
	}
	
	@RequestMapping("/producto/editarProducto")
	public String editarProducto(@RequestParam(value="id") Long id, 
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="descripcion") String descripcion ,
			@RequestParam(value="precio") int precio  , Model model) {
	
		
	
		Producto producto = productoService.buscarPorId(id).get();


		producto.setId(id);
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		
		producto = productoService.guardarProducto(producto);
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos = (ArrayList<Producto>) productoService.allProducto();
		int largoLista = listaProductos.size();
		
		model.addAttribute("listaProductos" ,listaProductos);
		model.addAttribute("largoLista" ,largoLista);
		

	return "productoTabla.jsp";
	

	}
	
}
