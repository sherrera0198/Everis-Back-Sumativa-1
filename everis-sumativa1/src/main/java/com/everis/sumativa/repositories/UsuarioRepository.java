package com.everis.sumativa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.everis.sumativa.models.Usuario;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	List<Usuario> findAll();
}
