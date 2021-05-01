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
<div class= "row">
<h1>Bienvenido</h1>

</div>
<hr>
<br>
<div class= "row">
<h3>Elija una opción</h3>

</div>


<br>

<div class="row">
<div class = "col-sm-4">
<form action="/usuario" method="POST">
<input type="submit" class="btn btn-success" value="Crear Usuario">
</form>
</div>

<div class = "col-sm-4">
<form action="/producto" method="POST">
<input type="submit" class="btn btn-primary" value="Crear Producto">
</form>
</div>


<div class = "col-sm-4">
<form action="/ventas" method="POST">
<input type="submit" class="btn btn-danger" value="Crear Venta">
</form>
</div>

<hr>
<div class= "container" >
<div class= "row">
<div class="alert alert-primary" role="alert">
  Se recomienda crear Usuario y Producto antes que venta para una mejor experienca.
</div>

</div>

</div>

</div>



</div>


</body>
</html>