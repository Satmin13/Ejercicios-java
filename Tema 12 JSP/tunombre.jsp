<%-- 
    Document   : tunombre
    Created on : 13-may-2017, 13:48:22
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">

        <title>Muestra tu nombre</title>
    </head>
    <body>
        <div class="cajita"><h1> Hola <% out.println(request.getParameter("nombre")); %> !</h1></div>
    </body>
</html>
