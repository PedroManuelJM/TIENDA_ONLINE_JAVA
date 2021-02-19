<%-- 
    Document   : DetallePedido
    Created on : 17-nov-2020, 23:27:49
    Author     : PCGAMING
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.carrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/stylehome.css">
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/bar.css">
        <!--estilo buscador -->
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/buscador.css">
        <!--fin estilo buscador -->
        <script type="text/javascript" src="/EXAMEN_T3/admin/js/progresbar.js"></script>
        <link href="https://fonts.googleapis.com/css2?family=Magra&display=swap" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap" rel="stylesheet"> 
        <!--ICONOS -->
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Rapidfast</title>
        <link rel="shortcut icon" href="admin/image/tienda.png"/> 
    </head>
    <%@include file="navegacion.jsp" %>
    <!-- MODALS -->
    <%@include file="modals.jsp" %>
    <% 
           int idventa= Integer.parseInt(request.getParameter("id_venta")); 
           String fecha= request.getParameter("fecha"); 
           String hora= request.getParameter("hora"); 
           String estado= request.getParameter("estado"); 
           double totalprecio=Double.parseDouble(request.getParameter("total_precio"));
     %>
    <body>
        <br><br><br>
        <div class="row">
            
            <div class="col-12">
                <div class="alert alert-info"><a href="" class="nav-link disabled">Su pedido se encuentra en <strong> Estado Pagado</strong> en poco tiempo se le enviara el Producto.</a></div>
            </div>
            
        </div>
         <div class="row">
            <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8" id="ptable">
                <table class="table table-striped">
                    <thead class="table-info text-center">
                        <th id="id_t">N- Pedido: <%=idventa%></th>
                        <th id="id_t">Id del Producto</th>
                        <th id="id_t">Producto</th>
                        <th id="id_t">Cantidad</th>
                        <th id="id_t">Precion unitario</th>
                        <th id="id_t">Total</th>
                    </thead>
                    <tbody class="text-center">
                         <% Conexion con=new Conexion();
                            carrito det=new carrito(con);
                            LinkedList<carrito> mostrardetallepedidos;
                                              mostrardetallepedidos = det.listarCarrito(idventa);
                                              for (carrito j : mostrardetallepedidos) {
                           
                           %>
                        
                           
                            <tr>
                                <td id="id_d" ><img class="imgRedonda-logo" id="srctable"  src="<%=j.getImagen()%>" style="width: 64px; height: 64px;"></td>
                                <td id="id_d" ><%=j.getId_product()%></td>
                                <td id="id_d" ><%=j.getNom_product()%></td>
                                <td id="id_d" ><%=j.getCantidad()%></td>
                                <td id="id_d" ><%=j.getPrecio_unidad()%></td>
                                <td id="id_d" >S/.<%=j.getPrecio_total()%></td>
                            </tr> 
                  <%}%>
                        <%
                            double total = 0;
                            double totaltal = 0;
                            DecimalFormat decimales = new DecimalFormat("0.00");
                            total =  totalprecio* 0.18;
                            totaltal = totalprecio+ total;
                        %>
                            <tr>
                                <td id="p_s2" colspan="5">SUBTOTAL</td>
                                <td id="p_le2">S/. <%=totalprecio%></td>
                            </tr>
                            <tr>
                                <td id="p_s2" colspan="5">IGV(18%)</td>
                                <td id="p_le2">S/. <%=decimales.format(total)%></td>
                            </tr>
                            <tr>
                 
                                <td id="p_s2" class="table-warning" colspan="5">TOTAL</td>
                                <td id="p_le2" class="table-dark" style="color: #fff">S/.<%=decimales.format(totaltal)%></td>
                            </tr>
                           
                    </tbody>
                </table>
                            <a href="Perfil.jsp" class="btn btn-warning" style="margin-left: 15px"> Ver mis Pedidos</a>
            </div>
            <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                <div class="row">
                    
                    <img src="admin/image/iconobodega.png">
                    <h1 class="display-4">Vista General</h1>
                </div>
                <div class="row">
                    <p>N- Pedido: <%=idventa%></p>
                </div>
                <div class="row">
                    <p>Fecha: <%=fecha%> </p>
                </div>
                <div class="row">
                    <input type="hidden" id="estateid" value="">
                    <p>Estado: <%=estado%></p>
                </div>
                <div class="row">
                    <h1 class="display-4">Datos del Usuario</h1>
                </div>
                <div class="row">
                    <p>Nombre: <%=user.getNombre()%>  <%=user.getApellido()%></p>
                </div>
                <div class="row">
                    <p><%=user.getTipodocumento()%> :  <%=user.getNro_documento()%> </p>
                </div> 
                <div class="row">
                    <h1 class="display-4">Direccion de entrega</h1>
                </div>
                <div class="row">
                    <p><%=user.getDireccion()%></p>
                </div>
                <div class="row">
                    <iframe id="mapa" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5516.596317048841!2d-77.03327190354908!3d-12.124282995930237!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x4968160a9f272918!2sBeso%20Franc%C3%A9s%20Creper%C3%ADa!5e0!3m2!1ses-419!2spe!4v1594849939574!5m2!1ses-419!2spe" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                </div>
            </div>
        </div>    
    </body>
    <!-- FOOTER-->
        <%@include file="footer_index.jsp" %>
</html>
