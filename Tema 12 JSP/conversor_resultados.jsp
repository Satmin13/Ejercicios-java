<%-- 
    Document   : conversor_resultados
    Created on : 13-may-2017, 14:30:38
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">

        <title>Resultado</title>
    </head>
    <body>
        <img src="Pesetaeuro.jpg" title="conversor" width="200" height="auto"/>
        <h1><i>ApliConver</i></h1>
        <div class="conversor">
           <%  
            
            double dinero = Double.parseDouble(request.getParameter("cantidad"));
            DecimalFormat formatoEuros = new DecimalFormat("0.00");
            
            if  (request.getParameter("tipo").equals("Euros a pesetas")) {
                out.print(formatoEuros.format(dinero) + " euros son " + Math.round(dinero * 166.386) + " pesetas.");
            }
           else {
                out.print(formatoEuros.format(dinero) + " pesetas son " + Math.round(dinero / 166.386) + " euros.");
                
            }
          %>
                    
        </div>
         
          
        
    </body>
</html>
