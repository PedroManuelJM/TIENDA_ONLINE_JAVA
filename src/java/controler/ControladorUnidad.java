/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Conexion;
import modelo.Unidad;

/**
 *
 * @author JhoxiZZ
 */
public class ControladorUnidad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Conexion con =new Conexion();
        String accion = request.getParameter("accion");
        
        if (accion.equals("Listar")) {
            Unidad u = new Unidad(con);
            LinkedList<Unidad> un = u.Listar(0, accion);
            request.setAttribute("Unidades",un);
            request.getRequestDispatcher("admin/unidad.jsp").forward(request, response);
        }

        if (accion.equals("Buscar")) {
            int id = Integer.parseInt(request.getParameter("Id"));
            String desc= request.getParameter("descripcion");
            request.setAttribute("id", id);
            request.setAttribute("descripcion",desc);
            request.getRequestDispatcher("admin/editarunidad.jsp").forward(request, response);
        }

        if (accion.equals("Eliminar")) {
            int id = Integer.parseInt(request.getParameter("Id"));
            Unidad st = new Unidad(con);
            LinkedList<Unidad> s= st.Listar(id, accion);
            response.sendRedirect("ControladorUnidad?accion=Listar");
        }        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        Conexion con =new Conexion();
        if (accion.equals("Registrar")) {
            Unidad un = new Unidad(con);  
            un.setDescripcion(request.getParameter("descripcion"));
   
            un.MantenerUnidad(un, accion);
            response.sendRedirect("ControladorUnidad?accion=Listar");
        }

        if (accion.equals("Editar")) {
            Unidad un = new Unidad(con);
            
            un.setId(Integer.parseInt(request.getParameter("id")));
            un.setDescripcion(request.getParameter("descripcion"));
            un.MantenerUnidad(un, accion);
            response.sendRedirect("ControladorUnidad?accion=Listar");
        }        
    }

}

