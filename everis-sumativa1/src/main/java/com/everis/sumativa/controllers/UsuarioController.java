package com.everis.sumativa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.services.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	///////agregar
	@RequestMapping("/usuarios/usuarioTabla")
	public String usuarios(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="password") String password ,
			@RequestParam(value="edad") int edad  , Model model) {
		System.out.println(nombre+" " +password);
		
		Usuario  usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		usuario.setEdad(edad);
		
		usuario = usuarioService.guardarUsuario(usuario);
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios = (ArrayList<Usuario>) usuarioService.allUsuario();
		int largoLista = listaUsuarios.size();
		
		model.addAttribute("listaUsuarios" ,listaUsuarios);
		model.addAttribute("largoLista" ,largoLista);
		
		
	return "usuarioTabla.jsp";
	

	}
	
	//////////eliminar	
	@RequestMapping("/eliminarUsuario")
	public String eliminarUsuario(@RequestParam(value="idEliminar") Long id, Model model) {
		
		String mensajeEliminado = usuarioService.eliminarUsuarioId(id);
		System.out.println(mensajeEliminado);
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios = (ArrayList<Usuario>) usuarioService.allUsuario();
		int largoLista = listaUsuarios.size();
		
		model.addAttribute("listaUsuarios" ,listaUsuarios);
		model.addAttribute("largoLista" ,largoLista);
		return "usuarioTabla.jsp";
	}
	
	
	/////////////editar
	@RequestMapping("/editarUsuario")
	public String editarUsuarioSelect(@RequestParam(value="idEditar") Long id, Model model) {
		
		Usuario usuario = usuarioService.buscarPorId(id).get();
		model.addAttribute("usuario",usuario);
	
		return "usuarioEditar.jsp";
	}
	
	@RequestMapping("/usuario/editarUsuario")
	public String editarUsuario(@RequestParam(value="id") Long id, 
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="password") String password ,
			@RequestParam(value="edad") int edad  , Model model) {
	
		
	
		Usuario usuario = usuarioService.buscarPorId(id).get();


		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		usuario.setEdad(edad);
		
		usuario = usuarioService.guardarUsuario(usuario);
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios = (ArrayList<Usuario>) usuarioService.allUsuario();
		int largoLista = listaUsuarios.size();
		
		model.addAttribute("listaUsuarios" ,listaUsuarios);
		model.addAttribute("largoLista" ,largoLista);
		

	return "usuarioTabla.jsp";
	

	}
	
	
	
	
}
