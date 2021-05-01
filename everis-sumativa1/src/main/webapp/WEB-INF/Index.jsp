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
<title>Registro Usuario</title>
</head>
<body>


<div class= "container">
<h1>Registro de Usuarios</h1>
<form action="/usuarios/usuarioTabla" method="POST">
	<div class= "row">
	         	<label for="nombre"  >Nombre: </label>
         	<input type="text" id="nombre" name="nombre" required >
	</div>
	<div class= "row">
	         	<label for="password"  >Password: </label>
         	<input type="text" id="password" name="password" required>
	</div>
	<div class= "row">
	         	<label for="edad"  >Edad: </label>
         	<input type="number" id="edad" name="edad" required>
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