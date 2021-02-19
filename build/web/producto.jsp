<%-- 
    Document   : newjsp
    Created on : 12-nov-2020, 12:57:31
    Author     : PCGAMING
--%>

<%@page import="modelo.detalle"%>
<%@page import="modelo.Conexion"%>
<%@page import="modelo.producto"%>
<%@page import="java.util.LinkedList"%>
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
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/bar.css">
        <script type="text/javascript" src="/RapidFast/admin/js/progresbar.js"></script>
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/stylehome.css">
        <link href="https://fonts.googleapis.com/css2?family=Magra&display=swap" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap" rel="stylesheet"> 
        <!--icon-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Productos</title>
        <!--estilo buscador  agregado-->
        <link rel="stylesheet" type="text/css" href="/RapidFast/admin/css/buscador.css">
        <!--fin estilo buscador -->
    </head>
    <%@include file="navegacion.jsp" %>
    <body>

        <%
            Integer id_venta = (Integer) session.getAttribute("idventa");
            Integer id_product = 0;
            try {
                id_product = Integer.parseInt(request.getParameter("id_prod"));
            } catch (Exception e) {
                request.getRequestDispatcher("Error404.jsp").forward(request, response);
            }

            boolean usuario = false;
            int cantidadProdCarrito = 0;
            if (user == null) {
            } else {
                usuario = true;
                Conexion conn5 = new Conexion();
                detalle det = new detalle(conn5);
                cantidadProdCarrito = det.compararProducto(id_venta, id_product);
            }
            Conexion conn = new Conexion();
            producto pro = new producto(conn);
            producto productoEncontrado = pro.buscarProducto(id_product);
        %>
        <!-----form de producto  -->     
        <form action="/RapidFast/mante_carrito" method="post">
            <div class="row" id="pre_forma">
                <div class="col-12 col-sm-12 col-md-5 col-lg-5 col-xl-5">
                    <div id="logo3">
                        <img class="img-thumbnail" id="pquelogo" src="<%=productoEncontrado.getImagen()%>"> 
                    </div>
                </div>
                <div class="col-12 col-sm-12 col-md-7 col-lg-7 col-xl-7">
                    <div class="row">
                        <span id="vistaproducto3"> </span> <!-- NOMBRE Y CARACTERISTICA-->
                    </div>
                    <input type="hidden" name="id_product" value="<%=id_product%>">

                    <input type="hidden" name="id_venta" value="<%=id_venta%>">

                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                            <div class="row">
                                <span id="vistaproducto">NOMBRE: <%=productoEncontrado.getNombre()%></span>
                            </div>        
                            <div class="row">
                                <span id="vistaproducto">MARCA: <%=productoEncontrado.getDes_marca()%></span>
                            </div>
                            <div class="row">
                                <span id="vistaproducto">CATEGORÍA: <%=productoEncontrado.getDes_categoria()%></span>
                            </div>
                            <div class="row">
                                <span id="vistaproducto">PRECIO: S/. <span id="preciounitario"><%=productoEncontrado.getPrecio()%></span></span>
                                <input type="hidden" name="precio_uni" value="<%=productoEncontrado.getPrecio()%>"> 
                            </div>
                            <div class="row">
                                <span id="vistaproducto">STOCK: <span id="stockProd"><%=productoEncontrado.getStock()%></span></span>
                            </div>
                            <div class="row">
                                <span id="vistaproducto">Cantidad en Carrito: <span id="cantidadProdCarrito"><%=cantidadProdCarrito%></span></span>
                                <input type="hidden" name="cantidad_carrito" value="<%=cantidadProdCarrito%>">
                            </div>
                            <div class="row">
                                <span id="vistaproducto">Cantidad: </span>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
                            <div class="row" id="boxpeque">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12" style="padding: 1rem">
                                    <div id="vistaproducto2" class="row">
                                        <span>PRECIO SUB-TOTAL </span>
                                    </div>
                                    <div id="vistaproducto" class="row">
                                        <span>S/.</span>
                                        <input id="show_precio" type="text" name="precio_subt" value="<%=productoEncontrado.getPrecio()%>" style="border:none">  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <button class="btn btn-outline-primary" type="button" id="restar"> - </button>
                            </div>
                            <div id="valor2">
                                <input class="form-control" type="text" id="valor_coger"  name="cantidad" value="1">
                                <input type="hidden" id="valor_max" value=" "> <!-- STOCK -->
                            </div>
                            <div class="input-group-append">
                                <button class="btn btn-outline-primary" type="button" id="sumar"> + </button>
                            </div>
                        </div>
                    </div>

                    <%
                        Usuario user3 = (Usuario) session.getAttribute("usuario");
                    %>
                    <div class="row">                                        
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                            <p class="favorito">
                               <% if (user3!= null ) {%>
                                <input id="radio8" type="radio" name="corazon" value=""  onclick="favorito(<%=user3.getId_usuario()%>,<%=id_product%>)">
                                <label  for="radio8" id="lavel23">♥</label><span id="vistaproducto5">Añadir a Favoritos</span>
                               <%}%>
                            </p>
                        </div>              
                    </div>  

                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                            <div class="row">
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">   
                                    <% if (usuario && cantidadProdCarrito == 0) {%>
                                    <input type="submit" class="form-control btn btn-success" name="registrar"  value="Add Carrito" >
                                    <%} else {%>
                                    <input type="submit" class="form-control btn btn-success" name="registrar"  value="Add Carrito" disabled>
                                    <%}%>
                                </div>
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <% if (usuario && cantidadProdCarrito != 0 && cantidadProdCarrito < productoEncontrado.getStock()) {%>
                                    <input type="submit" class="form-control btn btn-success" name="actualizar" value="Update Carrito">
                                    <%} else {%>
                                    <input type="submit" class="form-control btn btn-success" name="actualizar" value="Update Carrito" disabled>
                                    <%}%>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6"></div>
                    </div>       
                </div>
            </div>
        </form>



        <!-- MODALS -->
        <%@include file="modals.jsp" %>
        <!-- agregado footer -->
        <%@include file="footer_index.jsp" %>
        <!-- fin  agregado footer -->
        <script>
            let resta = document.getElementById('restar');
            let suma = document.getElementById('sumar');
            let cantidad = document.getElementById('valor_coger');
            let precioSubTotal = document.getElementById('show_precio');
            //Stock del producto
            let stock = Number(document.getElementById('stockProd').textContent);
            let cantProdCarrito = Number(document.getElementById('cantidadProdCarrito').textContent);
            let cant = Number(cantidad.value);
            let valorUnit = Number(precioSubTotal.value);

            resta.addEventListener('click', () => {
                if (cant === 1) {
                    alert('No se permiten menos de 1')
                } else {
                    cant--;
                    cantidad.value = cant;
                    precioSubTotal.value = cant * valorUnit;
                }
            });

            suma.addEventListener('click', () => {
                if (cant === (stock - cantProdCarrito)) {
                    alert('La cantidad no puede ser mayor al stock disponible')
                } else {
                    cant++;
                    cantidad.value = cant;
                    precioSubTotal.value = cant * valorUnit;
                }
            });

            function favorito(id_usuario, id_producto) {
                window.open("/RapidFast/ControladorWishlist?id_user=" + id_usuario + "&id_pro=" + id_producto + "&accion=agregar", "_self");
            }
        </script>
    </body>
</html>
