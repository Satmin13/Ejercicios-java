<%-- 
    Document   : tiradasPoker
    Created on : 14-may-2017, 17:49:23
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Póker dados</title>
    </head>
    <body>
        
        <% 
        int alea;
        for (int i = 0 ; i< 3 ; i++){
             alea = (int)(Math.random()*6 +1);
             if(alea==1){
                out.print( "<img src=\"as.jpg\">" );
             }
             if(alea==2){
                out.print( "<img src=\"rey.jpg\">" );
             }
             if(alea==3){
                out.print( "<img src=\"reina.jpg\">" );
             }
             if(alea==4){
                out.print( "<img src=\"jota.jpg\">" );
             }
             if(alea==5){
                out.print( "<img src=\"rojo.jpg\">" );
             }
             if(alea==6){
                out.print( "<img src=\"negro.jpg\">" );
             }
        }
        
        %>
    </body>
</html>
