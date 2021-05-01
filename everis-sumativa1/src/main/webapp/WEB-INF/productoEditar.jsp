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
<title>Editar Producto</title>
</head>
<body>


<div class= "container">
<h1>Editar  Producto</h1>
<form action="/producto/editarProducto" method="POST">

	<div class= "row">
	         	<label for="id"  >ID: </label>
         	<input type="text" id="id" name="id"  value="${producto.id}"  readonly  >
	</div>
	
	<div class= "row">
	         	<label for="nombre"  >Nombre: </label>
         	<input type="text" id="nombre" name="nombre" value="${producto.nombre}" required>
	</div>
	<div class= "row">
	         	<label for="descripcion"  >Descripción: </label>
         	<input type="text" id="descripcion" name="descripcion" value="${producto.descripcion}" required>
	</div>
	<div class= "row">
	         	<label for="precio"  >Precio: </label>
         	<input type="number" id="precio" name="precio" value="${producto.precio}"required>
	</div>
	<br>
	<br>
	<div class= "row">
	
         	<input type="submit" value="Enviar" class="btn btn-success">
	</div>

</form>

</div>


</body>
</html>