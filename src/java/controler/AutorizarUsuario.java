/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Conexion;
import modelo.EnviarToken;
import modelo.Usuario;
import modelo.token;
import modelo.venta;

/**
 *
 * @author JhoxiZZ
 */
public class AutorizarUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mensaje = "";
        Date fecha_completa = new Date();
        DateFormat horaformat = new SimpleDateFormat("HH:mm");
        DateFormat fechaformat = new SimpleDateFormat("yyyy-MM-dd");
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        Conexion conn = new Conexion();
        Usuario us = new Usuario(conn);
        Usuario use = new Usuario();
        use = us.AutorizaUsuario(user, password);
        RequestDispatcher rd;

        if (use != null && use.getIdtipo_usuario() == 1) {
            session.setAttribute("usuario", use);
            rd = request.getRequestDispatcher("admin/admin-area.jsp");
            rd.forward(request, response);
        } else if (use != null && use.getIdtipo_usuario() == 2 && use.getEstado().equalsIgnoreCase("habilitado")) {
            Conexion conn1 = new Conexion();
            venta ven = new venta(conn1);
            venta v = ven.buscarVentaEnProcedo(use.getId_usuario());
            
            if(v.getId_venta()> 0){
                session.setAttribute("idventa", v.getId_venta());
            }else{
                String hora = horaformat.format(fecha_completa);
                String fecha = fechaformat.format(fecha_completa);
                int id_venta = ven.Addventa(use.getId_usuario(), fecha, hora, "proceso");
                if(id_venta == 0){
                    System.out.println("Está retornando 0 en id_venta, revisar el metodo venta.Addventa");
                }else{
                    session.setAttribute("idventa", id_venta);
                }
            }
            
            conn1.desconectar();
            session.setAttribute("usuario", use);
            rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
        } else if (use != null && use.getIdtipo_usuario() == 2 && use.getEstado().equalsIgnoreCase("inhabilitado")) {
            token TOKEN = new token();
            String enviartoken = TOKEN.generateString();// genera el token             
            mensaje = ": Su cuenta actualmente se encuentra inactiva, por favor revise su correo: " + use.getUsername();
            request.setAttribute("token", enviartoken);
            request.setAttribute("nombreusuario", use.getUsername());
            request.setAttribute("idusuario", use.getId_usuario());
            request.setAttribute("apellidousuario", use.getApellido());
            request.setAttribute("mensaje", mensaje);
            EnviarToken et = new EnviarToken();
            boolean validar = et.enviatoken(enviartoken, use.getNombre(), use.getApellido(), use.getUsername());
            if (validar == true) {
                rd = request.getRequestDispatcher("admin/validar_cuenta.jsp");
                rd.forward(request, response);
            }else{
            rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            }
        } else {
            rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
    }
}
