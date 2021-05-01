package com.everis.sumativa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.services.UsuarioService;

@Controller
public class HomeController {
	
	@Autowired
	UsuarioService usuarioService;

	@RequestMapping("")
	public String base() {
		return "base.jsp";
	}
	
	@RequestMapping("/usuario")
	public String inicio() {
		
		return "Index.jsp";
	}
	
	
	
	@RequestMapping("/usuario/usuarioTabla")
	public String usuarioTabla(Model model) {
		
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios = (ArrayList<Usuario>) usuarioService.allUsuario();
		int largoLista = listaUsuarios.size();
		
		model.addAttribute("listaUsuarios" ,listaUsuarios);
		model.addAttribute("largoLista" ,largoLista);
		
		return "usuarioTabla.jsp";
	}
}
