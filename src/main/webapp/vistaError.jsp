<%-- 
    Document   : vistaError
    Created on : 08-09-2022, 10:03:43
    Author     : Jano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getAttribute("msjError") %></h1>
    </body>
</html>
