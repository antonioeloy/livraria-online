<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Livraria online</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>

<body>

	<!-- Navbar -->
	<nav class="navbar navbar-dark bg-dark">
	  	<div class="container-fluid">
	    	<a class="navbar-brand" href="#">AUTORES</a>
	  	</div>
	</nav>

	<!-- Formulário de cadastro de autor -->
	<div class="container">
		<div class="card mt-3">
		
			<!-- Cabeçalho (título do formulário) -->
			<div class="card-header">
				<h1 class="text-center">Cadastro de Autor</h1>
			</div>
			
			<!-- Corpo (campos do formulário) -->
			<div class="card-body">
				<form action='<c:url value="autores"></c:url>' method="post">
			
					<!-- Nome -->
					<div class="mb-3">
						<label for="nome" class="form-label">Nome</label>
						<input type="text" id="nome" name="nome" placeholder="Nome completo do autor" class="form-control" required>
					</div>
					
					<!-- Email -->
					<div class="mb-3">
						<label for="email" class="form-label">Email</label>
						<input type="email" id="email" name="email" placeholder="exemplo@email.com.br" class="form-control" required>
					</div>
					
					<!-- Data de nascimento -->
					<div class="mb-3">
						<label for="dataNascimento" class="form-label">Data de nascimento</label>
						<input type="date" id="dataNascimento" name="dataNascimento" class="form-control" required>
					</div>
					
					<!-- Minicurrículo -->
					<div class="mb-3">
						<label for="miniCurriculo" class="form-label">Minicurrículo</label>
						<textarea id="miniCurriculo" name="miniCurriculo" rows="3" placeholder="Principais obras do autor" class="form-control" required></textarea>
					</div>
					
					<!-- Botão "Cadastrar" -->
					<button type="submit" class="btn btn-primary mb-3">Cadastrar</button>
					
				</form>
			</div>
			
		</div>
		
		<!-- Tabela com os autores -->
		<div class="card mt-3 mb-3">
		
			<!-- Cabeçalho (título da tabela) -->
			<div class="card-header">
				<h1 class="text-center">Lista de Autores</h1>
			</div>
			
			<!-- Corpo (linhas da tabela) -->
			<div class="card-body">
				<table class="table table-striped table-hover table-bordered">
					<thead>
						<tr>
							<th>NOME</th>
							<th>EMAIL</th>
							<th>DATA NASCIMENTO</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${autores}" var="autor">
							<tr>
								<td>${autor.nome}</td>
								<td>${autor.email}</td>
								<td><fmt:parseDate value="${autor.dataNascimento}" pattern="yyyy-MM-dd" var="formatada" type="date" /><fmt:formatDate value="${formatada}" pattern="dd/MM/yyyy" type="date"/></td>
							</tr>
						</c:forEach>
					</tbody>
					
				</table>
			</div>
		</div>
	</div>
</body>
</html>