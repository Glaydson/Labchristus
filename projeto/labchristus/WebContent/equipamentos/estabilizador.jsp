<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LABCHRISTUS - Cadastro de Estabilizador</title>
</head>
<body>
	<h1>Cadastro de Estabilizador</h1>

	<form action="ConfirmarCadastro">

		<label for="serieId">Número de Série</label> 
		<input type="text" name="numeroSerie" id="serieId" required="required"><br /> 
		<label for="marcaId">Marca</label> 
		<input type="text" name="marca"	id="marcaId" required="required"><br /> 
		<label for="modeloId">Modelo</label>
		<input type="text" name="modelo" id="modeloId" required="required"><br />
		<label for="potenciaId">Potência</label> 
		<input type="number" name="potencia" id="potenciaId" required="required"><br /> 
		<input type="submit" value="Cadastrar">

	</form>
</html>