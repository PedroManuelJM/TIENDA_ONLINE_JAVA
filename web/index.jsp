<%-- 
    Document   : index
    Created on : 12-nov-2020, 11:15:31
    Author     : PCGAMING
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="modelo.Reporteproducto_masvendido"%>
<%@page import="modelo.Conexion"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.producto"%>
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
    <body>

        <div class="row ">
            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">

            </div>
        </div> 
        <div class="row">
            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12" style="padding:0">
                <div class="row" id="panel" style="margin:0">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                        <div id="vista" class="carousel slide" data-ride="carousel">
                            <ul class="carousel-indicators">
                                <li data-target="#vista" data-slide-to="0" class="active"></li>
                                <li data-target="#vista" data-slide-to="1"></li>
                                <li data-target="#vista" data-slide-to="2"></li>
                            </ul>

                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img id="spon" src="admin/image/manzana.jpg">
                                </div>
                                <div class="carousel-item">
                                    <img id="spon" src="admin/image/pollo.jpg">
                                </div>
                                <div class="carousel-item">
                                    <img id="spon" src="admin/image/todo.jpg">
                                </div>
                            </div>

                            <a class="carousel-control-prev" href="#vista" data-slide="prev">
                                <span class="carousel-control-prev-icon"></span>
                            </a>
                            <a class="carousel-control-next" href="#vista" data-slide="next">
                                <span class="carousel-control-next-icon"></span>
                            </a>
                        </div>
                    </div>

                </div>
            </div>
        </div>  

        <!-- VISTA DE LOS PRODUCTOS -->  
        <div class="row">
            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">    
                <%
                    Conexion conn = new Conexion();
                    producto pro = new producto(conn);
                    LinkedList<producto> lista = pro.ListarProducto();%>
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5">
                        <div class="row" id="promit">
                            <% for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i).getStock() > 0) {%>
                            <div  id="inprod" class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-3">
                                <div id="margen">
                                    <img  class="img-thumbnail" id="cargaimagen" src="<%=lista.get(i).getImagen()%>">
                                    <p id="product" ><%=lista.get(i).getNombre()%> </p>
                                    <div id="produ"class="row">
                                        <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
                                            <div class="container">
                                                <input id="VerProducto" type="button" class="btn btn-danger" value="Ver Producto" onclick="verproducto(<%=lista.get(i).getId_producto()%>)" style="margin-left: -10px">                                          
                                            </div>
                                        </div>
                                        <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                                            <div class="row">
                                                <!-- agregasr-->
                                                <a id="canasta" href="" class="btn btn-success disabled" ><img id="newc" src="admin/image/tienda.png"></a>
                                                <!-- /////////////-->         
                                            </div>
                                            <div id="stockkk">
                                                <span style="color: white;"><%=lista.get(i).getStock()%></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>        
                            </div>          
                            <%}
                                }%>  
                        </div>
                    </div>
                </div>
            </div>           
        </div>                    

        <!--  FIN --  VISTA DE LOS PRODUCTOS -->   
        <%
            Conexion connCarrusel = new Conexion();
            Reporteproducto_masvendido carrusel = new Reporteproducto_masvendido(connCarrusel);
            LinkedList<Reporteproducto_masvendido> lista_carrusel = carrusel.ProductomasVendido();%>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5">
                        <div class="row" id="promit">
                            <span id="p_caro">Productos mas vendidos</span>  
                        </div>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5">
                        <div class="row" id="promit">
                            <%for (Reporteproducto_masvendido c : lista_carrusel) {
                            %>
                            <div  id="inprod" class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-3">
                                <div id="margen">
                                    <img  class="img-thumbnail" id="cargaimagen" src="<%=c.getImg()%>">
                                    <p id="product" ><%=c.getProducto()%></p>
                                    <div id="produ"class="row">
                                        <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
                                            <div class="container">
                                                <form method="post" action="producto.jsp" >
                                                    <input type="hidden" value="<%=c.getId()%>" name="id_prod">  
                                                    <input type="submit" id="btn" class="btn btn-danger" value="Ver Producto"> 
                                                </form>

                                            </div>
                                        </div>
                                        <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                                            <div class="row">
                                                <!-- agregasr-->
                                                <a id="canasta" href="" class="btn btn-success disabled" ><img id="newc" src="admin/image/tienda.png"></a>
                                                <!-- /////////////-->
                                            </div>
                                            <div id="stockkk">
                                                <span style="color: white;"><%=c.getStock()%></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>        
                            </div> 
                            <%    }%> 
                        </div>
                    </div>
                </div>   
            </div>
        </div>  

        <!-- MODALS -->
        <%@include file="modals.jsp" %>

        <!-- Modal Productos quitados del carrito por falta de stock-->
        <div class="modal fade" id="ModalProductosQuitados" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="exampleModalLabel">Productos quitados</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <h6>Los siguientes productos fueron quitados, debido a que ya no contamos con la cantidad solicitada.</h6>
                        
                        <input id="quitarProd" type="hidden" value="${QuitarProducto}">


                        <table id="table" class="dataTable no-footer" role="grid" aria-describedby="table_info" style="width: 100%;">
                            <thead>
                                <tr role="row"><td class="sorting_asc" tabindex="0" aria-controls="table" rowspan="1" colspan="1" aria-label=": activate to sort column descending" style="width: 0px;" aria-sort="ascending"></td></tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${productosQuitados}" var="productoQuitado">
                                    <tr role="row" class="odd">
                                        <td style="background-color:#ffffff;" class="sorting_1">
                                            <a>
                                                <button type="submit" class="SubmitButtonClass btn-light" style="border:none; padding:0px"> <img src="${productoQuitado.getImagen()}" style="width:60px ;"></button> 
                                                <span style="margin-left:5px">
                                                    ${productoQuitado.getNombre()}
                                                    <h6 style="margin-left:68px;margin-top:-20px">${productoQuitado.getCaracteristicas()}</h6>
                                                </span>
                                                <input type="hidden" value="6" name="id_prod">  

                                            </a> 
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Aceptar</button>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function verproducto(idpro)
            {
                window.open("/RapidFast/producto.jsp?id_prod=" + idpro + "", "_self");
            }
            $(document).ready(function () {
                try {
                    let QuitarProducto = document.getElementById('quitarProd').value;
                    if (QuitarProducto === "true") {
                        $('#ModalProductosQuitados').modal('show');
                    }
                } catch (e) {

                }
            });
        </script>  

        <!-- FOOTER-->
        <%@include file="footer_index.jsp" %>

    </body>
</html>

