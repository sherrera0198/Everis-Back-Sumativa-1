package com.everis.sumativa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa.models.Venta;
import com.everis.sumativa.repositories.VentasRepository;
import java.util.Optional;

@Service
public class VentasService {

	@Autowired
	VentasRepository ventasRepository;
	
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return  ventasRepository.save(venta);
	}

	public List<Venta> allVenta() {
		// TODO Auto-generated method stub
		return ventasRepository.findAll();
	}

	public String eliminarUsuarioId(Long id) {
		// TODO Auto-generated method stub
		try {
			ventasRepository.deleteById(id);
		}catch (Exception e) {
			return "Venta no encontrado";
		}
		return "Venta ha sido eliminada";
	}

	public Optional<Venta> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return ventasRepository.findById(id);
	}

}
