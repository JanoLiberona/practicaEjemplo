<%-- 
    Document   : vistaExito
    Created on : 08-09-2022, 10:03:50
    Author     : Jano
--%>

<%@page import="Modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad Calificada 1 Alejandro Liberona</title>
    </head>
    <body>
        <h1><% 
            
            Persona personar = (Persona)request.getAttribute("persona");

            %></h1>
            
            <h3> Rut: <%= personar.getRut() %>   </h3>
            <h3> Nombre: <%= personar.getNombre() %>   </h3>
            <h3> Apellido: <%= personar.getApellido() %>   </h3>
            <h3> Dirección: <%= personar.getDireccion() %>   </h3>
            <h3> Comuna: <%= personar.getComuna() %>   </h3>
            <h3> Fecha de Nacimiento: <%= personar.getFnacimiento() %>   </h3>
            <h3> Género: <%= personar.getGenero() %>   </h3>
            <h3> Redes Sociales: <%= personar.getRrss() %>   </h3>
    </body>
</html>
