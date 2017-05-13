<%-- 
    Document   : tablaNumero
    Created on : 13-may-2017, 17:16:34
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">

        <title>Tabla de multiplicar</title>
    </head>
    <body>
        
        <h1>RESULTADO</h1>
        <div align="center">
            <%
                int num = 0;
                int resul = 0;
                out.print("<table border=1 >");
                for(int i=1 ; i<11 ; i++){
                   num = Integer.parseInt(request.getParameter("numero"));
                   resul = num * i;
                   out.println("<tr> <td>" + num + " x "  + i + " = " + resul + "</td></tr>");
                }            
                out.print("</table> ");
            %>
          </div>
    </body>
</html>
