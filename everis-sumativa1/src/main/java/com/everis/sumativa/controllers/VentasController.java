package com.everis.sumativa.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa.models.Producto;
import com.everis.sumativa.models.Usuario;
import com.everis.sumativa.models.Venta;
import com.everis.sumativa.services.ProductoService;
import com.everis.sumativa.services.UsuarioService;
import com.everis.sumativa.services.VentasService;

@Controller
public class VentasController {

	@Autowired
	VentasService ventaService;
	@Autowired
	ProductoService productoService;
	@Autowired
	UsuarioService usuarioService;
	
///////agregar
	@RequestMapping("/ventas/formulario")
	public String agregarVentas(@RequestParam(value="idUsuario") String idUsuario,
			@RequestParam(value="listaProductos" ) String listaProductos ,
			@RequestParam(value="fecha") String fecha  , Model model) {

		
		Venta venta = new Venta();
		venta.setIdUsuario(idUsuario);
		venta.setListaProductos(listaProductos);
		venta.setFecha(fecha);
		
		venta = ventaService.guardarVenta(venta);
		ArrayList<Venta> listaVentas = new ArrayList<Venta>();
		
		listaVentas = (ArrayList<Venta>) ventaService.allVenta();
		int largoLista = listaVentas.size();
		
		model.addAttribute("listaVentas" ,listaVentas);
		model.addAttribute("largoLista" ,largoLista);
		
		
	return "ventaTabla.jsp";
	

}
//////////eliminar	
@RequestMapping("/eliminarVenta")
public String eliminarVenta(@RequestParam(value="idEliminar") Long id, Model model) {
	
	String mensajeEliminado = ventaService.eliminarUsuarioId(id);
	System.out.println(mensajeEliminado);
	
	ArrayList<Venta> listaVentas = new ArrayList<Venta>();
	listaVentas = (ArrayList<Venta>) ventaService.allVenta();
	int largoLista = listaVentas.size();
	
	model.addAttribute("listaVentas" ,listaVentas);
	model.addAttribute("largoLista" ,largoLista);
	return "ventaTabla.jsp";
}



/////////////editar
@RequestMapping("/editarVenta")
public String editarVentaSelect(@RequestParam(value="idEditar") Long id, Model model) {
	
	Venta venta = ventaService.buscarPorId(id).get();
	model.addAttribute("venta",venta);

	/////////////////pasar lista de productos
	ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	listaProductos= (ArrayList<Producto>)productoService.allProducto();
	int largoListaProducto= listaProductos.size();
	
	////////////////////pasar lista de Usuarios
	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	listaUsuarios= (ArrayList<Usuario>)usuarioService.allUsuario();
	int largoListaUsuario= listaUsuarios.size();
	
	
	model.addAttribute("listaProductos" ,listaProductos);
	model.addAttribute("largoListaProducto" ,largoListaProducto);
	model.addAttribute("listaUsuarios" ,listaUsuarios);
	model.addAttribute("largoListaUsuario" ,largoListaUsuario);
	

	return "ventaEditar.jsp";
}

@RequestMapping("/venta/editarVenta")
public String editarVenta(@RequestParam(value="id") Long id,
		@RequestParam(value="idUsuario") String idUsuario,
		@RequestParam(value="listaProductos" ) String listaProductoss ,
		@RequestParam(value="fecha") String fecha  , Model model) {

	

	Venta venta = ventaService.buscarPorId(id).get();


	venta.setId(id);
	venta.setIdUsuario(idUsuario);
	venta.setListaProductos(listaProductoss);
	venta.setFecha(fecha);
	
	//////////////////lista de ventas
	venta = ventaService.guardarVenta(venta);
	ArrayList<Venta> listaVentas = new ArrayList<Venta>();
	
	listaVentas = (ArrayList<Venta>) ventaService.allVenta();
	int largoLista = listaVentas.size();
	
	model.addAttribute("listaVentas" ,listaVentas);
	model.addAttribute("largoLista" ,largoLista);
	

return "ventaTabla.jsp";


}

	
	
}
