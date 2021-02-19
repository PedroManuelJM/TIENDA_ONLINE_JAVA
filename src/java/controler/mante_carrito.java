/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Conexion;
import modelo.Usuario;
import modelo.carrito;

/**
 *
 * @author JhoxiZZ
 */
@WebServlet(name = "mante_carrito", urlPatterns = {"/mante_carrito"})
public class mante_carrito extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Conexion conn = new Conexion();
        carrito car=new carrito(conn);
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {

            if(request.getParameter("registrar") != null){
            int id_venta=Integer.parseInt(request.getParameter("id_venta"));
            int id_product=Integer.parseInt(request.getParameter("id_product"));
            int cantidad=Integer.parseInt(request.getParameter("cantidad"));
            float precio_uni=Float.valueOf(request.getParameter("precio_uni"));
            float precio_total=Float.valueOf(request.getParameter("precio_subt")); 
            
            car.agregarcarrito(id_venta, id_product, cantidad, precio_total);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            if(request.getParameter("actualizar") != null){
            int id_venta=Integer.parseInt(request.getParameter("id_venta"));
            int id_product=Integer.parseInt(request.getParameter("id_product"));
            int cantidad= Integer.parseInt(request.getParameter("cantidad"));
            int cant_carrito = Integer.parseInt(request.getParameter("cantidad_carrito"));
            
            car.Editarcarrito(id_venta, id_product, cantidad+cant_carrito);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            }
                  
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Conexion con=new Conexion();
        carrito c=new carrito(con);
        int id_carr=Integer.parseInt(request.getParameter("car"));
        int id_prod=Integer.parseInt(request.getParameter("pro"));
        c.Eliminardetalle(id_carr,id_prod);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
