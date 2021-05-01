package com.everis.sumativa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.services.UsuarioService;

@RestController
public class ApiController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/api/usuarios")
	public List<Usuario>listaUsuarios(){
		
		List<Usuario> alumnos_lista = usuarioService.allUsuario();
		
		return alumnos_lista;
	}
	
	
	@RequestMapping("/api/usuarios/{id}")
	public Optional<Usuario> buscarUsuario(@PathVariable("id") Long id ) {
		
		Optional<Usuario> usuario = usuarioService.buscarPorId(id);
		
		return usuario;
	}
}
