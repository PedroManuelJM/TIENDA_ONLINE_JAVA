/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Conexion;
import modelo.producto;

/**
 *
 * @author JhoxiZZ
 */
@WebServlet(name = "mante_producto", urlPatterns = {"/mante_producto"})
public class mante_producto extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int cont=0;
         Conexion con=new Conexion();
         producto pro=new producto(con);
       
        /////////////////////////
        try (PrintWriter out = response.getWriter()) {
                int id_prod=Integer.parseInt(request.getParameter("id_prod"));
                String nombre=request.getParameter("nombre");
                String caract=request.getParameter("caract");
                int id_marca=Integer.parseInt(request.getParameter("id_marca"));
                int id_categoria=Integer.parseInt(request.getParameter("id_categoria"));
                float precio=Float.valueOf(request.getParameter("precio"));
                int stock=Integer.parseInt(request.getParameter("id_stock"));
                int id_unidad=Integer.parseInt(request.getParameter("id_unidad"));
                String filename="admin/image/productos/"+request.getParameter("filename");
            /////////////////////////////////////////
            if(request.getParameter("registrar") != null){
                pro.Agregarproducto(id_prod,nombre,caract,precio,id_marca,id_categoria,stock,id_unidad,filename);
                request.getRequestDispatcher("admin/producto.jsp").forward(request, response);
                }
            //////////////////////////////////////////////
            if(request.getParameter("actualizar") != null){
                id_prod=Integer.parseInt(request.getParameter("id_prod"));
                pro.Editarproducto(id_prod,nombre,caract,precio,id_marca,id_categoria,stock,id_unidad,filename,id_prod);
                request.getRequestDispatcher("admin/producto.jsp").forward(request, response);
                }
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Conexion con=new Conexion();
         producto pro=new producto(con);
        
        int id_prod=Integer.parseInt(request.getParameter("id"));
        pro.Eliminarproducto(id_prod);
        request.getRequestDispatcher("admin/producto.jsp").forward(request, response);
    }
    
}

