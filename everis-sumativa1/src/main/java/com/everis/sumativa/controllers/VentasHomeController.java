package com.everis.sumativa.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.models.Venta;
import com.everis.sumativa.services.ProductoService;
import com.everis.sumativa.services.UsuarioService;
import com.everis.sumativa.services.VentasService;

@Controller
@RequestMapping("/ventas")
public class VentasHomeController {

	@Autowired
	VentasService ventaService;
	@Autowired
	ProductoService productoService;
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String inicio(Model model) {
		
		/////////////////pasar lista de productos
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos= (ArrayList<Producto>)productoService.allProducto();
		int largoListaProducto= listaProductos.size();
		
		////////////////////pasar lista de Usuarios
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios= (ArrayList<Usuario>)usuarioService.allUsuario();
		int largoListaUsuario= listaUsuarios.size();
		
		
		model.addAttribute("listaProductos" ,listaProductos);
		model.addAttribute("largoListaProducto" ,largoListaProducto);
		model.addAttribute("listaUsuarios" ,listaUsuarios);
		model.addAttribute("largoListaUsuario" ,largoListaUsuario);
		

		return "formularioVenta.jsp";
	}
	
	@RequestMapping("/tabla")
	public String  ventaTabla(Model model) {
		
		ArrayList<Venta> listaVentas = new ArrayList<Venta>();
		listaVentas = (ArrayList<Venta>) ventaService.allVenta();
		int largoLista = listaVentas.size();
		
		model.addAttribute("listaVentas" ,listaVentas);
		model.addAttribute("largoLista" ,largoLista);
		
		return "ventaTabla.jsp";
	}
	

	
	
}

