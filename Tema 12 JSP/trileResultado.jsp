<%-- 
    Document   : trileResultado
    Created on : 15-may-2017, 19:33:11
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado!</h1>
        <%
            int resul = Integer.parseInt(request.getParameter("1"));
            int alea = (int)(Math.random()* 3 + 1);
            if((resul == alea) && (alea == 1)){
        %>
            <h2>Has ganado</h2>
                <table> 
                <tr> <td> <img src="cubileteDados.jpg"> </td> 
                    <td> <img src="cubilete.jpg"> </td> 
                    <td> <img src="cubilete.jpg"> </td> 
                </tr>
                </table>
        <%
            } 
        if((resul == alea) && (alea == 2)){
        %>
            <h2>Has ganado</h2>
                    <table> 
                <tr> <td> <img src="cubilete.jpg"> </td> 
                    <td> <img src="cubileteDados.jpg"> </td> 
                    <td> <img src="cubilete.jpg"> </td> 
                </tr>
                </table>
        <%
            } 
        if((resul == alea) && (alea == 3)){
        %>
            <h2>Has ganado</h2>
                    <table> 
                <tr> <td> <img src="cubilete.jpg"> </td> 
                    <td> <img src="cubilete.jpg"> </td> 
                    <td> <img src="cubileteDados.jpg"> </td> 
                </tr>
                </table>
        <%
            } if((resul != alea)) { 
        %> 
            <h2>Lo siento, has perdido.. estaba en el cubilete <% out.print(alea);%></h2>
            <table> 
            <tr> <td> <img src="cubilete.jpg"> </td> 
                <td> <img src="cubilete.jpg"> </td> 
                <td> <img src="cubilete.jpg"> </td>
                
            </tr>
            </table>
            <%}
        %>
    </body>
</html>
