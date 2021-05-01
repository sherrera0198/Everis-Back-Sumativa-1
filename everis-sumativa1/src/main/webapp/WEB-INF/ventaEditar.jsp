<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Venta</title>
</head>
<body>


<div class= "container">
<h1>Editar  Venta</h1>
<form action="/venta/editarVenta" method="POST">

	<div class= "row">
	         	<label for="id"  >ID: </label>
         	<input type="text" id="id" name="id"  value="${venta.id}"  readonly  >
	</div>
	
	         	<div class= "row">
	         	<label for="idProductos"  >Usuario : </label>
	         	<div class="input-group mb-3">
				  <label class="input-group-text" for="iidUsuario">Seleccione ID</label>
				  <select class="form-select" id="idUsuario"  name="idUsuario"  required readonly >
				  		<option selected value="${venta.idUsuario}"  readonly>ID: ${venta.idUsuario} </option>
				    	<c:forEach var = "i" begin = "1" end = "${largoListaUsuario}">
				    				<option value="${listaUsuarios[i].getId()}" readonly> Nombre: ${listaUsuarios[i].getNombre()}  ID: ${listaUsuarios[i].getId()} </option>
				    	
				    	</c:forEach>
				  </select>
				</div>
	
	<div class= "row">
	         	<label for="idProductos"  >Productos : </label>
	         	<div class="input-group mb-3">
				  <label class="input-group-text" for="listaProductos">Seleccione ID</label>
				  <select class="form-select" id="listaProductos" name="listaProductos" multiple="multiple" required>
				    <option selected value="${venta.listaProductos}">ID:  ${venta.listaProductos}    </option>
					<c:forEach var = "i" begin = "1" end = "${largoListaProducto}">
				    				<option value=${listaProductos[i].getId()}> Nombre: ${listaProductos[i].getNombre()}  ID: ${listaProductos[i].getId()} </option>
				    	
				    	</c:forEach>
				  </select>
				</div>
	</div>
	<div class= "row">
	         	<label for="fechas"  >Fecha: </label>
         	<input type="date" id="fecha" name="fecha" required>
	</div>
	<div class= "row">
	        
	</div>
	<br>
	<br>
	<br>
	<br>
	<div class= "row">
	
         	<input type="submit" value="Enviar" class="btn btn-success">
	</div>

</form>

</div>


</body>
</html>