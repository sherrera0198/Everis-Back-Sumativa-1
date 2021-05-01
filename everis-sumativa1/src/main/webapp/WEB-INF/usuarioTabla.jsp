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
<title>Tabla Usuarios</title>
</head>
<body>

<div class="container" >
<div class="row">  <h1>Lista de Usuarios</h1>   </div>
<br>
<br>
<table class=table>
	<thead>
		<tr>
			<th>ID </th>
			<th>Nombre </th>
			<th>Password</th>
			<th>Edad</th>
		</tr>
		
	</thead>
	<tbody>


	<c:forEach var = "i" begin = "0" end = "${largoLista}">
			<tr>
			<th> <c:out value="${listaUsuarios[i].getId()}"></c:out> </th>
			<th><c:out value="${listaUsuarios[i].getNombre()}"></c:out> </th>
			<th><c:out value="${listaUsuarios[i].getPassword()}"></c:out></th>
			<th><c:out value="${listaUsuarios[i].getEdad()}"></c:out></th>
			
		</tr>
	</c:forEach>
	</tbody>
	
</table>

</div>

<div class= "container">

<form action="/eliminarUsuario" method="POST">
	<div class= "row">

		<div class= "col-sm-2">
			<label for="idEliminar"  >ID para eliminar: </label>
		</div>
		<div class= "col-sm-2">
	         	<input type="number" id="idEliminar" name="idEliminar">
		</div>
		<div class= "col-sm-2">
	         	<input type="submit" value="Borrar" class="btn btn-danger">
		</div>

	</div>
 </form>
</div>


<div class= "container">

<form action="/editarUsuario" method="POST">
	<div class= "row">

		<div class= "col-sm-2">
			<label for="idEditar"  >ID para editar: </label>
		</div>
		<div class= "col-sm-2">
	         	<input type="number" id="idEditar" name="idEditar">
		</div>
		<div class= "col-sm-2">
	         	<input type="submit" value="Editar" class="btn btn-warning">
		</div>

	</div>
 </form>
</div>





</body>
</html>