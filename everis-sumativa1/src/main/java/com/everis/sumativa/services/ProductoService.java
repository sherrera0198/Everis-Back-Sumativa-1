package com.everis.sumativa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	public List<Producto> allProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	public String eliminarUsuarioId(Long id) {
		// TODO Auto-generated method stub
		
		try {
			productoRepository.deleteById(id);
		}catch (Exception e) {
			return "Producto no encontrado";
		}
		return "Producto Eliminado";
	}

	public Optional<Producto> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}
	
	
}
