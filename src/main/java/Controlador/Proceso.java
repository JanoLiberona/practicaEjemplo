package Controlador;

import Modelo.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Proceso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String rut, nombre, apellido, direccion, comuna, fnacimiento, genero, rrss;
        String msjError;

        if (request.getParameter("rut").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar el Rut";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("nombre").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar el Nombre";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("apellido").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar el Apellido";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("direccion").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar la Dirección";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("comuna").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar la Comuna";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("fnacimiento").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar la Fecha de Nacimiento";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("genero").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar el Género";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else if (request.getParameter("rrss").trim().equalsIgnoreCase("")) {
            
            msjError = "Debe ingresar una red social";
            request.setAttribute("msjError", msjError);
            request.getRequestDispatcher("/vistaError.jsp").forward(request,response);
            
        } else {
            rut = request.getParameter("rut");
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            direccion = request.getParameter("direccion");
            comuna = request.getParameter("comuna");
            fnacimiento = request.getParameter("fnacimiento");
            genero = request.getParameter("genero");
            rrss = request.getParameter("rrss");
            
            Persona persona = new Persona(rut, nombre, apellido, direccion, comuna, fnacimiento, genero, rrss);
            request.setAttribute("persona",persona);
            request.getRequestDispatcher("/vistaExito.jsp").forward(request,response);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
