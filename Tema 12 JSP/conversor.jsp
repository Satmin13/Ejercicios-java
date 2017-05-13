<%-- 
    Document   : conversor
    Created on : 13-may-2017, 14:09:08
    Author     : Fatima
    Ejercicio 7
    Combina las dos aplicaciones anteriores en una sola de tal forma que en la
    página principal se pueda elegir pasar de euros a pesetas o de pesetas a euros.
    Adorna la página con alguna foto o dibujo. 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="estilos.css" rel="stylesheet">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de monedas</title>
    </head>
    <body>
        <div class="conversor">            
            <h1><i>ApliConver</i></h1>
            <form method="post" action="conversor_resultados.jsp">                
                <p>¿A qué quieres convertirlo?</p>
                <select name="tipo">
                    <option selected="Euros">Euros a pesetas</option>
                    <option>Pesetas a euros</option>
                </select>
                <p>¿Cuánto vamos a convertir? Acepto decimales. (Ej: 1.50) </p>      
                Cantidad: <input type="text" name="cantidad">
                <input type="submit" value="Convertir">
            </form>
        </div>
    </body>
</html>
