/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JhoxiZZ
 */
public class ControladorProducto extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String accion = request.getParameter("accion");
            
            HttpSession session = request.getSession();
        if (accion.equals("Listar")) {
         
            request.getRequestDispatcher("admin/producto.jsp").forward(request, response);
        } 
        else if(accion.equals("Editar")){
        int proid=Integer.parseInt(request.getParameter("id"));
        session.setAttribute("producto",proid);
        request.getRequestDispatcher("admin/producto_editar.jsp").forward(request, response);    
        }  

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equals("Registrar")) {
            response.sendRedirect("ControladorProducto?accion=Listar");
        }
    }
}
