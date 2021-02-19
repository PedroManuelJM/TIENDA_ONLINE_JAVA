<%-- 
    Document   : Perfil
    Created on : 16-nov-2020, 17:29:35
    Author     : PCGAMING
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.venta"%>
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
        
      <body>
          <br><br><br>
          <section id="productos" class="padded">
              <div class="container">
                  <h2>Mi Perfil</h2>
                  <div class="row">
                      <div class="col-md-3">
                          <br>
                          <h5 class="text-uppercase">
                             <%=user.getNombre()%> <%=user.getApellido()%> 
                          </h5>
                          <h6>
                              Dirección
                          </h6>
                          <span>
                             <%=user.getDireccion()%>  
                          </span>

                      </div>
                      <div class="col-md-9">

                          <ul class="nav nav-tabs" id="myTab" role="tablist">
                              <li class="nav-item">
                                  <a class="nav-link active" id="home-tab" data-toggle="tab" href="#lista" role="tab" aria-controls="home" aria-selected="true">Mis Pedidos</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link" id="profile-tab" data-toggle="tab" href="#cuadricula" role="tab" aria-controls="profile" aria-selected="false">WhisList</a>
                              </li>

                          </ul>
                          <div class="tab-content" id="myTabContent">
                              <div class="tab-pane fade show active" id="lista" role="tabpanel" aria-labelledby="home-tab">          
                                  <table class="table table-striped table-bordered table-hover">
                                      <% Conexion buscadorpersona = new Conexion();
                       venta bper = new venta(buscadorpersona); %>
                                      <thead class="thead-dark text-center">
                                          <tr>
                                              <th>Nro-Venta</th>
                                              <th>Fecha y Hora</th>
                                              <th>Cantidad Productos</th>
                                              <th>Total</th>
                                              <th>Estado</th>
                                              <th>Detalle</th>
                                          </tr>
                                      </thead>
                                      <tbody class="text-center">
                                          <%
                                              LinkedList<venta> mostrarpedidos;
                                              mostrarpedidos = bper.buscarPedidosCliente(user.getId_usuario());
                                              for (venta j : mostrarpedidos) {
                                                 double totaltal=j.getPre_total();
                                          %>
                                          <tr>
                                              <td><%=j.getId_venta()%></td>  
                                              <td><%=j.getFecha()%> , <%=j.getHora()%> </td> 
                                              <td><%=j.getC_comprada()%></td>  
                                              <td> <% DecimalFormat decimales = new DecimalFormat("0.00");%> 
                                              S/. <%=decimales.format(totaltal)%> </td>
                                              <td><%=j.getEstado()%></td>
                                             <form action="DetallePedido.jsp" method="post">
                                                 <td><button type="submit"class="btn btn-success"><i class="fa fa-plus-square"></i></button></td>
                                                 <input type="hidden" value="<%=j.getId_venta()%>" name="id_venta">  
                                                 <input type="hidden" value="<%=j.getFecha()%>" name="fecha">  
                                                 <input type="hidden" value="<%=j.getHora()%>" name="hora">  
                                                 <input type="hidden" value="<%=j.getEstado()%>" name="estado"> 
                                                 <input type="hidden" value="<%=j.getPre_total()%>" name="total_precio">
                                             </form>
                                             
                                          </tr>

                                          <%}%>
                                      </tbody>   
                                  </table>
                              </div>
                              <div class="tab-pane fade" id="cuadricula" role="tabpanel" aria-labelledby="profile-tab">
                                  <div class="card-columns">

                                      <div class="card">
                                          <img src="productos/fotogr1.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto1</h5>
                                              <p>Descripción1</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr2.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto2</h5>
                                              <p>Descripción2</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr3.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto3</h5>
                                              <p>Descripción3</p>
                                          </div>    
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr4.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto4</h5>
                                              <p>Descripción4</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr5.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto5</h5>
                                              <p>Descripción5</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr6.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto6</h5>
                                              <p>Descripción6</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr7.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto7</h5>
                                              <p>Descripción7</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr8.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto8</h5>
                                              <p>Descripción8</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr9.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto9</h5>
                                              <p>Descripción9</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr10.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto10</h5>
                                              <p>Descripción10</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr11.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto11</h5>
                                              <p>Descripción11</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr12.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto12</h5>
                                              <p>Descripción12</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr13.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto13</h5>
                                              <p>Descripción13</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr14.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto14</h5>
                                              <p>Descripción14</p>
                                          </div>
                                      </div>
                                      <div class="card">
                                          <img src="productos/fotogr15.jpg" alt="" class="card-img-top">
                                          <div class="card-body">
                                              <h5 class="card-title">Producto15</h5>
                                              <p>Descripción15</p>
                                          </div>
                                      </div>
                                  </div><!-- card-columns -->
                              </div>
                          </div>

                      </div>
                  </div><!-- row -->
              </div><!-- container -->
          </section><!-- productos -->       








      </body>
    
     <%@include file="footer_index.jsp" %>
</html>
