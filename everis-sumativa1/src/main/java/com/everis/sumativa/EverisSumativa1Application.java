package com.everis.sumativa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.services.ProductoService;
import com.everis.sumativa.services.UsuarioService;

@SpringBootApplication
public class EverisSumativa1Application {

	@Autowired
	UsuarioService usuarioService;
	@Autowired
	ProductoService productoService;
	public static void main(String[] args) {
		SpringApplication.run(EverisSumativa1Application.class, args);
	

		
	Usuario u1 = new Usuario("Sebastian", "123456",23);
	Usuario u2 = new Usuario("Jose", "123456",23);
	Usuario u3 = new Usuario("Juan", "123456",23);
	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	listaUsuarios.add(u1);
	listaUsuarios.add(u2);
	listaUsuarios.add(u3);
	
	
	Producto p1 = new Producto("Sebastian", "123456",23);
	Producto p2 = new Producto("Jose", "123456",23);
	Producto p3 = new Producto("Juan", "123456",23);
	ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	listaProductos.add(p1);
	listaProductos.add(p2);
	listaProductos.add(p3);
	
	

	}

}
