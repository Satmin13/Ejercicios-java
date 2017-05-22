<%-- 
    Document   : calendario
    Created on : 15-may-2017, 12:24:52
    Author     : Fatima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">

        <title>Calendario</title>
    </head>
    <body>
       <div class="cajita">
            <h1>Muestra el mes que necesitas</h1>
         <form method="post" action="creaCalendario.jsp">
          Mes:
          <select name="mes">
            <option>enero</option>
            <option>febrero</option>
            <option>marzo</option>
            <option>abril</option>
            <option>mayo</option>
            <option>junio</option>
            <option>julio</option>
            <option>agosto</option>
            <option>septiembre</option>
            <option>octubre</option>
            <option>noviembre</option>
            <option>diciembre</option>
          </select>
          Año: <input type="number" min="1" name="anio"></br></br>
          ¿En qué cae el día 1?:
          <select name="dia1">
            <option value="1">lunes</option>
            <option value="2">martes</option>
            <option value="3">miércoles</option>
            <option value="4">jueves</option>
            <option value="5">viernes</option>
            <option value="6">sábado</option>
            <option value="7">domingo</option>
          </select></br></br>
          ¿Cuántos días tiene el mes?: <input type="number" min="28" max="31" name="diastotales"></br></br>

          <input type="submit" value="Aceptar">
        </form>
       </div>
    </body>
</html>
