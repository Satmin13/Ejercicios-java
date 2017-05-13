<%-- 
    Document   : Ej123
    Created on : 13-may-2017, 12:48:21
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="estilos.css" rel="stylesheet">
        <title>Mi nombre y el tuyo</title>
    </head>
    <body>
        <div class="cajita"> 
            <% out.println("<h2>Hola, me llamo Fátima ¿y tú?</h2>"); %>
            
        </div>
		<br/>
		<form method="post" action="tunombre.jsp">
		Escribe tu nombre: <input type="text" name="nombre">
		<input type="submit" name="Enviar">
		</form>
    </body>
</html>
