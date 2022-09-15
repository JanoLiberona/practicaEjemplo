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
        <table border="1" align="center" cellspacing="0">
            <tr>
                <td>
                    <table class="mastertab" border="0" cellspacing="0" width="800">	<!--Tabla maestra-->
                        <tr> <!--Espacio 1-->
                            <td colspan="2"></td>
                        </tr>
                        <tr> <!--Titulo-->
                            <td colspan="2">
                                <table border="0" class="Titulo" align="center" width="260" cellspacing="1">
                                    <tr>
                                        <td align="center">Datos Ingresados</td>
                                        <%Persona personar = (Persona) request.getAttribute("persona");%>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr> <!--Espacio 2-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Rut-->
                            <td width="170" align="center">Rut:</td>
                            <td width="100" align="left"><%= personar.getRut()%>  </td>
                        </tr>
                        <tr> <!--Espacio 3-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Nombre-->
                            <td width="170" align="center">Nombre:</td>
                            <td width="100" align="left"><%= personar.getNombre()%></td>
                        </tr>
                        <tr> <!--Espacio 4-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Apellido-->
                            <td width="170" align="center">Apellido:</td>
                            <td width="100" align="left"><%= personar.getApellido()%></td>
                        </tr>
                        <tr> <!--Espacio 5-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Dirección-->
                            <td width="170" align="center">Dirección:</td>
                            <td width="100" align="left"><%= personar.getDireccion()%></td>
                        </tr>
                        <tr> <!--Espacio 6-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Comuna-->
                            <td width="170" align="center">Comuna:</td>
                            <td width="100" align="left"><%= personar.getComuna()%></td>
                        </tr>
                        <tr> <!--Espacio 7-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Fecha de Nacimiento-->
                            <td width="170" align="center">Fecha de Nacimiento:</td>
                            <td width="100" align="left"><%= personar.getFnacimiento()%></td>
                        </tr>
                        <tr> <!--Espacio 8-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Género-->
                            <td width="170" align="center">Género:</td>
                            <td width="100" align="left"><%= personar.getGenero()%></td>
                        </tr>
                        <tr> <!--Espacio 9-->
                            <td colspan="2"><p></td>
                        </tr>
                        <tr> <!--Rrss-->
                            <td width="170" align="center">Redes Sociales:</td>
                            <td width="100" align="left"><%= personar.getRrss()%></td>
                        </tr>
                        <tr> <!--Espacio 10-->
                            <td colspan="2"><p></td>
                        </tr>
                        </tr>
                        <tr> <!--Boton-->
                            <td width="170" align="center" colspan="2"><button type="submit"><a href='index.html'>Volver</a></button></td>
                        </tr>
                        <tr> <!--Espacio 12-->
                            <td colspan="2"><p></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
