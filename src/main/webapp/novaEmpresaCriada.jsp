<%
String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);

%>

<html>
	<body>
		Empresa <%= nomeEmpresa %> Cadastrada com sucesso!
	</body>

</html>

