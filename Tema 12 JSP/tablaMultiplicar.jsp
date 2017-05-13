<%-- 
    Document   : tablaMultiplicar
    Created on : 13-may-2017, 17:11:31
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Tablas de multiplicar</title>
        
    </head>
    <body>
        <h1>¿De qué número quieres ver su tabla de multiplicar?</h1>
        <form method="post" action="tablaNumero.jsp">
            Insera el número: <input type="text" name="numero">
            <input type="submit" value="Crea tabla">
        </form>          
       
    </body>
</html>
