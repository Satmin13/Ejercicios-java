<%-- 
    Document   : trile
    Created on : 15-may-2017, 19:25:51
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trile</title>
    </head>
    <body>
        <h1>El Trile</h1>
        <table> 
            <tr> <td> <img src="cubilete.jpg"> </td> 
                <td> <img src="cubilete.jpg"> </td> 
                <td> <img src="cubilete.jpg"> </td> 
            </tr>
            <form action="trileResultado.jsp" method="post">                
            
                <tr> <td> <input type="submit" name="1" value="1" > </td> 
                <td> <input type="submit" name="1" value="2"> </td> 
                <td> <input type="submit" name="1" value="3"> </td> 
            </tr>
            
            </form>
    </body>
</html>
