package com.everis.sumativa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everis.sumativa.models.Venta;

public interface VentasRepository extends CrudRepository<Venta, Long> {

	List<Venta> findAll();
}
