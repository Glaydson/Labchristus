<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LABCHRISTUS - Cadastro de Impressora</title>
</head>
<body>
	<h1>Cadastro de Impressora</h1>

	<form action="selecionaLotacao.html">

		<label for="serieId">N�mero de S�rie</label> 
		<input type="text" name="numeroSerie" id="serieId" required="required"><br /> 
		<label for="marcaId">Marca</label> 
		<input type="text" name="marca" id="marcaId" required="required"><br /> 
		<label for="modeloId">Modelo</label>
		<input type="text" name="modelo" id="modeloId" required="required"><br />
		<label for="tipoId">Tipo</label> 
		<select id="tipoId">
			<option value="Jato de Tinta">Jato de Tinta</option>
			<option value="Laser">Laser</option>
			<option value="Matricial">Matricial</option>
		</select><br /> 
		<label for="bulkId">Existe Bulk Ink?</label>
		<input type="checkbox" name="bulkink" id="bulkId" required="required"><br />
		
		<input type="submit" value="Cadastrar">

	</form>
</body>
</html>