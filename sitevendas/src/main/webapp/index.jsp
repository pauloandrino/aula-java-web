<html>
<link rel="stylesheet" href="css/bootstrap.css">
<body>
	<h2>Adicionar Produto</h2>
	
	<div class="jumbotron">
	  <div class="container">
			<form action="adiciona" class="form-horizontal">
				<div class="form-group">
					<label for=nome>Nome:</label> 
					<input type="text" class="form-control" name="nome" id="nome" required="required" autofocus placeholder="Insira seu nome"/><br />
				</div>
				<div class="form-group">
					<label for=valor>Valor:</label>
					<input type="text" class="form-control" name="valor" id="valor" required="required" /><br />
				</div>
				<div class="form-group">
					<label for=codigo>C&oacute;digo:</label> 
					<input type="text" class="form-control" name="codigo" id="codigo" required="required" /><br />
				</div>
				<div class="form-group">
					<label for=data>Data:</label>
					<input type="date" class="form-control" name="data" id="data" required="required" /><br />
				</div>
		
				<button type="submit" class="btn btn-primary">Gravar</button>
				<input type="reset" class="btn btn-primary" name="reset" value="Limpar">
				<br/><br/><br/>
			</form>
		</div>
	</div>
	<span class="glyphicon glyphicon-pencil"></span>
</body>
</html>
