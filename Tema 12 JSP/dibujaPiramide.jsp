<%-- 
    Document   : dibujaPiramide
    Created on : 14-may-2017, 16:56:32
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
        <%
    int altura = 1;
    int alturaTotal= Integer.parseInt(request.getParameter("alturaIntroducida"));
    int i = 0;
    int espacios = alturaTotal - 1;
    String relleno = request.getParameter("relleno");
    
    while (altura <= alturaTotal) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        out.print( "<img src=\"espacios.jpg\">" );
      }

      // pinta la línea
      for (i = 1; i < altura * 2; i++) {       
        
         out.print("<img src=\"" + relleno + ".jpg\" width=\"150px\" height=\"auto\">");
        
      }

      out.println("<br/>");

      altura++;
      espacios--;
    }
    %>
        
    </body>
</html>
