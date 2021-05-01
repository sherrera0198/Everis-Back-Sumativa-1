package com.everis.sumativa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everis.sumativa.models.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
	List<Producto> findAll();

}
