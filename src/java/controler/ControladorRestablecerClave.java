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
import modelo.Conexion;
import modelo.Usuario;

/**
 *
 * @author JhoxiZZ
 */
public class ControladorRestablecerClave extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Conexion con=new Conexion();
        HttpSession sesion = request.getSession();
     
        String recatarid= String.valueOf(sesion.getAttribute("idusuario"));
        int id = Integer.parseInt(recatarid);
        String cambiarclave= String.valueOf(request.getParameter("nueva_clavee"));
        
        System.out.println(id  +"---" + cambiarclave);
        try (PrintWriter out = response.getWriter()) {
        Usuario us= new Usuario(con);
        us.Editarclave(id,cambiarclave, id);     
        //response.sendRedirect("index.jsp");
        out.println("<html><head><script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script></head><body onload=\"Swal.fire({\n" +
        "  title: 'Se cambio su contraseña!',\n" +
        "  text: 'Ahora podrá acceder a la plataforma',\n" +
        "  icon: 'success',\n" +
        "  showConfirmButton: false,\n" +
        "  timer: 2500\n"+       
        "}); window.location='index.jsp'\"></body></html>");
        out.close();
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

   


}

