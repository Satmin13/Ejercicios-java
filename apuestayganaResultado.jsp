<%-- 
    Document   : apuestayganaResultado
    Created on : 15-may-2017, 21:04:37
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apuesta y Gana</title>
    </head>
    <body>
        <h1>Apuesta y Gana!</h1>
        <form method="post" action="apuestaygana.jsp">
        <%
             if("POST".equalsIgnoreCase(request.getMethod())){
           double resul = Double.parseDouble(request.getParameter("dinero"));
           int alea = (int)(Math.random()* 3 + 1);
           
            if (alea==1){
               resul = resul * 2;
           out.print("<img src=\"as.jpg\" >Volver a Jugar <input type=submit name =\"result\" value=\"" + resul + "\"> Has duplicado! " + resul);
           }
            if (alea==2){
               resul = resul / 2;
           out.print("<img src=\"Gatos.jpg\" >Volver a Jugar <input type=submit name =\"result\" value=\"" + resul + "\"> Recuperas la mitad! " + resul);
           }
            if (alea==3){
               resul = 0;
           out.print("<img src=\"gato.jpg\">Volver a Jugar <input type=submit name =\"result\" value=\"" + resul + "\"> Oh! Has perdido.. " + resul );
           }
             }
        %>
        </form>
    </body>
</html>
