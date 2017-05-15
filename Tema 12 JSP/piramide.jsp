<%-- 
    Document   : piramide
    Created on : 14-may-2017, 16:52:50
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pirámide</title>
    </head>
    <body>
        <h1>Pinta pirámide</h1>
        <form method="post" action="dibujaPiramide.jsp">
            Escribe una altura para la pirámide(máximo 5): <input type="text" name="alturaIntroducida">
            
            <input type="submit" value="Crea pirámide">
        </form>
    </body>
</html>
