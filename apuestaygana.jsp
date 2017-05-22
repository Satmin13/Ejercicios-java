<%-- 
    Document   : apuestaygana
    Created on : 15-may-2017, 20:56:25
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
        <h1>Hello World!</h1>
        <form method="post" action="apuestayganaResultado.jsp">
            
            ¿Cuánto quieres apostar?: 
            <% 
                
                //String dinRest = request.getParameter("result");
               if("POST".equals(request.getMethod())){ 
                   out.print("<input type=\"text\" name=\"dinero\" value=\"" + Double.parseDouble(request.getParameter("result")) + "\">");
               }else{
                   out.print("<input type=\"text\" name=\"dinero\" value=\"\" >");                        
               }
            
            %>
       
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
