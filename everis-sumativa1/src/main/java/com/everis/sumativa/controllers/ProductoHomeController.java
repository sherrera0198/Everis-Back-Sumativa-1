package com.everis.sumativa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.services.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoHomeController {

	@Autowired
	ProductoService productoService;
	
	@RequestMapping("")
	public String inicio() {
		
		return "formularioProducto.jsp";
	}
	
	
	@RequestMapping("/tabla")
	public String productoTabla(Model model) {
		
		

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos= (ArrayList<Producto>)productoService.allProducto();
		int largoLista= listaProductos.size();
		
		model.addAttribute("listaProductos" ,listaProductos);
		model.addAttribute("largoLista" ,largoLista);
		
		
		return "productoTabla.jsp";
	}
}
