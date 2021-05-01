package com.everis.sumativa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> allUsuario() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	public String eliminarUsuarioId(Long id) {
		// TODO Auto-generated method stub
		try {
			usuarioRepository.deleteById(id);
		}catch (Exception e) {
			return "Usuario no encontrado";
		}
		
		
		return "Usuario Eliminado" ;
	}

	public String editarUsuarioId(Long id) {
		// TODO Auto-generated method stub
		try {
			 usuarioRepository.findById(id);
		}catch (Exception e) {
			return "Usuario no encontrado";
		}
		
		return "usuario encontrado";
	}
	
	
}
