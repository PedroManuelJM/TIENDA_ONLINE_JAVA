/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Conexion;
import modelo.Usuario;

/**
 *
 * @author JhoxiZZ
 */
public class ValidarCuenta extends HttpServlet {

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

        String tokenusuario = request.getParameter("tokencliente");
        String tokenenviado = request.getParameter("tokenenviado");
        int idcliente = Integer.parseInt(request.getParameter("idusuario"));
        System.out.println(tokenusuario);
        System.out.println(tokenenviado);
        System.out.println(idcliente);
        RequestDispatcher rd;
        //HttpSession session = request.getSession();

        if (tokenusuario.equals(tokenenviado)) {
            Conexion conn = new Conexion();
            Conexion con1 = new Conexion();
            Usuario us = new Usuario(conn);
            Usuario use = new Usuario(con1);
            use = us.HabilitarUsuario(idcliente);
            //session.setAttribute("usuario", use);
            System.out.println(use.getNombre());
            response.sendRedirect("index.jsp");
            //rd = request.getRequestDispatcher("index.jsp");
            //rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
