/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Conexion;
import modelo.Reporte_cliente;
import modelo.Usuario;
import modelo.carrito;
import modelo.producto;
import modelo.venta;

/**
 *
 * @author JhoxiZZ
 */
@WebServlet(name = "mante_venta", urlPatterns = {"/mante_venta"})
public class mante_venta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Conexion conn = new Conexion();
        venta ventaUpdate = new venta(conn);
        Date fecha_completa = new Date();
        DateFormat horaformat = new SimpleDateFormat("HH:mm");
        DateFormat fechaformat = new SimpleDateFormat("yyyy-MM-dd");
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            boolean productosQuitados = false;
            LinkedList<producto> productoQuitado = new LinkedList<>();
            int id_user = Integer.parseInt(request.getParameter("id_user"));
            Usuario user = (Usuario) session.getAttribute("usuario");
            if (user != null) {
                if (id_user == user.getId_usuario()) {
                    int id_venta = Integer.parseInt(request.getParameter("id_ven"));
                    Conexion con = new Conexion();
                    venta carrito = new venta(con);
                    LinkedList<venta> carritoo = carrito.buscarCantidadDetalle(id_venta);                  
                    LinkedList<producto> productoss = new LinkedList<>();
                    for (int i = 0; i < carritoo.size(); i++) {
                        Conexion con1 = new Conexion();
                        producto prodd = new producto(con1);
                        productoss.add(prodd.buscarStockProd(carritoo.get(i).getId_producto()));
                    }           
                    
                    for (int i = 0; i < carritoo.size(); i++) {
                        for (int j = 0; j < productoss.size(); j++) {
                            if (carritoo.get(i).getId_producto() == productoss.get(j).getId_producto()) {
                                if (carritoo.get(i).getC_comprada() > productoss.get(j).getStock()) {
                                    Conexion con2 = new Conexion();
                                    carrito deta = new carrito(con2);
                                    deta.Eliminardetalle(id_venta, productoss.get(j).getId_producto());
                                    productoQuitado.add(productoss.get(j));
                                    productosQuitados = true;
                                }
                                break;
                            }                         
                        }
                    }
                    if (productosQuitados) {
                        request.setAttribute("productosQuitados", productoQuitado);
                        request.setAttribute("QuitarProducto", "true");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    } else {
                        String hora = horaformat.format(fecha_completa);
                        String fecha = fechaformat.format(fecha_completa);
                        ventaUpdate.updateventa(id_venta, id_user, fecha, hora, "pagado");
                        Conexion conn1 = new Conexion();
                        venta ventaAdd = new venta(conn1);
                        int new_id_venta = ventaAdd.Addventa(id_user, fecha, hora, "proceso");
                        if (new_id_venta > 0) {

                            Conexion conn2 = new Conexion();
                            venta v = new venta(conn2);
                            String nom = "", direc = "", correo = "", tipo = "", fechaa = "", horaa = "";
                            int dni = 0;
                            LinkedList<venta> listav = v.ventalista();
                            Conexion conn3 = new Conexion();
                            Reporte_cliente rc = new Reporte_cliente(conn3);
                            LinkedList<Reporte_cliente> listarc = rc.reporte_clientes();
                            for (int c = 0; c < listarc.size(); c++) {
                                if (id_user == listarc.get(c).getId()) {
                                    nom = listarc.get(c).getNombre() + " " + listarc.get(c).getApellido();
                                    direc = listarc.get(c).getDireccion();
                                    correo = listarc.get(c).getUsuario();
                                    tipo = listarc.get(c).getDescripcion();
                                    dni = Integer.parseInt(listarc.get(c).getNro_documento());
                                }
                            }
                            for (int i = 0; i < listav.size(); i++) {
                                if (id_venta == listav.get(i).getId_venta() && id_user == listav.get(i).getId_usuario() && listav.get(i).getEstado().equals("pagado")) {
                                    fechaa = listav.get(i).getFecha();
                                    horaa = listav.get(i).getHora();
                                }
                            }

                            float sub = 0;
                            double total = 0;
                            double totaltal = 0;
                            LinkedList<venta> productosBoucher = new LinkedList<venta>();
                            Conexion conn4 = new Conexion();
                            producto prod = new producto(conn4);
                            for (int i = 0; i < listav.size(); i++) {
                                if (id_venta == listav.get(i).getId_venta() && id_user == listav.get(i).getId_usuario() && listav.get(i).getEstado().equals("pagado")) {
                                    venta productos = new venta();
                                    sub = sub + listav.get(i).getPreciostotal();
                                    productos.setNom_pro(listav.get(i).getNom_pro());
                                    productos.setCarac(listav.get(i).getCarac());
                                    productos.setC_comprada(listav.get(i).getC_comprada());
                                    productos.setP_unitario(listav.get(i).getP_unitario());
                                    productos.setPreciostotal(listav.get(i).getPreciostotal());
                                    int stock = prod.buscarProducto(listav.get(i).getId_producto()).getStock() - listav.get(i).getC_comprada();
                                    prod.actualizarStock(listav.get(i).getId_producto(), stock);
                                    productosBoucher.add(productos);
                                }
                            }
                            conn4.desconectar();

                            DecimalFormat decimales = new DecimalFormat("0.00");
                            total = sub * 0.18;
                            totaltal = sub + total;
                            Double totalDolar = totaltal * 0.28;

                            session.removeAttribute("idventa");
                            session.setAttribute("idventa", new_id_venta);
                            //Valores de los id
                            request.setAttribute("id_us", id_user);
                            request.setAttribute("id_ve", id_venta);
                            //Valores para el reporte del boucher
                            request.setAttribute("nombre_usuario", nom);
                            request.setAttribute("direccion", direc);
                            request.setAttribute("correo", correo);
                            request.setAttribute("tipo", tipo);
                            request.setAttribute("dni", dni);
                            request.setAttribute("fecha", fechaa);
                            request.setAttribute("hora", horaa);
                            request.setAttribute("subtotal", sub);
                            request.setAttribute("total", decimales.format(total));
                            request.setAttribute("totaltal", decimales.format(totaltal));
                            request.setAttribute("TotalDolar", totalDolar);

                            //Mandamos un arreglo de productos
                            request.setAttribute("productoVoucher", productosBoucher);

                            request.getRequestDispatcher("Boucher.jsp").forward(request, response);
                        } else {
                            System.out.println("Hay problemas en el metodo v.Addventa, retorna un valor menor o igual a 0");
                        }
                    }

                } else {
                    request.getRequestDispatcher("Paginanoautorizada.jsp").forward(request, response);
                }
            } else {
                request.getRequestDispatcher("Paginanoautorizada.jsp").forward(request, response);
            }
        }
    }
}
