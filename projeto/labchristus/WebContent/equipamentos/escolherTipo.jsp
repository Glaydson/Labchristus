<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Labchristus - Cadastrar Equipamento</title>
</head>
<body>
	<h1>Selecione o tipo de equipamento desejado para continuar</h1>
	<form action="CadastrarEquipamento" method="post">
		<select name="tipo" >
			<c:forEach items="${tiposEquipamento }" var="item">

				<option value="${item.nome }">${item.nome}</option>

			</c:forEach>
		</select> 
		<input type="submit" value="Continuar">
	</form>
</body>
</html>