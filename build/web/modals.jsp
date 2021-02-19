<%@page import="modelo.WishList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.carrito"%>
<%@page import="modelo.Conexion"%>
<%@page import="modelo.Usuario"%>
<!-- MODAL LOGIN -->    
<div class="container">              
    <div class="modal fade" id="ModalLogin">
        <div class="modal-dialog">
            <div class="modal-content">
                <form method="post" action="${pageContext.request.contextPath}/AutorizarUsuario">
                    <div class="modal-header">
                        <img src="admin/image/tienda.png" class="img-fluid" style="height: 50px">

                        <h2 style="margin-left: 130px">RapidFast</h2>

                        <button type="button" class="close" data-dismiss="modal">&times;</button>  
                    </div>
                    <div class="modal-body">

                        <div class="input-group mb-4">
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="material-icons">person</i></div>
                            </div>
                            <input id="correo" type="text" name="user" class="form-control" placeholder="Nombre de Usuario" required="">                                     
                        </div> <!--input-group mb-4 -->
                        <div class="input-group mb-4">
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="material-icons">lock</i></div>
                            </div>
                            <input id="password" type="password" name="password" class="form-control" placeholder="Contraseña" required="">  
                        </div> <!--input-group mb-4 --> 
                        <a class="nav-link" href="Recuperar_Cuenta.jsp" style="margin-left: 290px"> Olvidastes tu clave? </a>                           
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-light" data-dismiss="modal">Cancelar</button>
                        <input type="submit" class="btn btn-dark" name="registrar" value="Ingresar" onclick="">                        
                    </div>
                </form>
            </div>    
        </div>
    </div>
</div>
<!-- FIN MODAL LOGIN-->   

<!-- **************************** MODAL CARRITO DE COMPRA ***********************************-->
<div class="container">
    <div class="modal fade" id="mymodal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 id="carrito"class="modal-title display-4">Carrito</h1>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>  
                </div>

                <div class="modal-body">
                    <%
                        Usuario user1 = (Usuario) session.getAttribute("usuario");
                        Integer id_venta1 = (Integer) session.getAttribute("idventa");
                        if (user1 == null) {%>
                    <div class="row">
                        <h1 class="display-4">Agrega Productos al Carrito</h1>
                    </div>

                    <%} else {
                        Conexion conn1 = new Conexion();
                        carrito carrito = new carrito(conn1);
                        LinkedList<carrito> carrito_usuario = carrito.listarCarrito(id_venta1);
                        for (int i = 0; i < carrito_usuario.size(); i++) {%>                   



                    <div id="st_first" class="row">
                        <div id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <di>
                                    <img id="immodel" src="<%=carrito_usuario.get(i).getImagen()%>"> 
                                </di>
                            </div>
                        </div>
                        <div  id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <p id="vistaproducto"><%=carrito_usuario.get(i).getNom_product()%> - <%=carrito_usuario.get(i).getCaracat()%></p>
                                </div>
                            </div>
                        </div>
                        <div  id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <p id="vistaproducto"><%=carrito_usuario.get(i).getDes_marca()%> / <%=carrito_usuario.get(i).getDes_categoria()%></p>
                                </div>
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <p id="vistaproducto"><%=carrito_usuario.get(i).getCantidad()%></p>
                                </div>
                            </div> 
                        </div>
                        <div id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <p style="margin-bottom: 0%; " id="vistaproducto" >S\. <%=carrito_usuario.get(i).getPrecio_unidad()%></p>
                                    <p id="vistaproducto" ><%=carrito_usuario.get(i).getUnidad()%></p>
                                </div>
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <p id="vistaproducto">S\. <%=carrito_usuario.get(i).getPrecio_total()%></p>
                                </div>
                            </div>
                            <div  class="row" >
                                <div id="modal_basura" class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <div>
                                        <a type="button" class="close" href="/RapidFast/mante_carrito?car=<%=carrito_usuario.get(i).getId_venta()%>&pro=<%=carrito_usuario.get(i).getId_product()%>"><img id="bt_basura" src="/EXAMEN_T3/admin/image/basura.png"></a>        
                                    </div>
                                </div>    
                            </div>    
                        </div>
                    </div>                   
                    <%
                            }
                        }
                    %>

                </div>
                <div class="modal-footer">
                    <% if (user1 != null) {%>
                    <a href="mante_venta?id_user=<%=user1.getId_usuario()%>&id_ven=<%=id_venta1%>" type="button" class="btn btn-success">Comprar</a>
                    <%}%>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>                
                </div>
            </div>    
        </div>
    </div>
</div>                            
<!-- ********************* FIN - -  MODAL DE CARRITO DE COMPRA    ************ -->

<!-- **************************** MODAL DE WISH LIST ***********************************-->
<div class="container">
    <div class="modal fade" id="ModalWishlist">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 id="carrito"class="modal-title display-4">Lista de deseos</h1>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>  
                </div>
                <%if (user1 == null) {
                                    } else {%>
                <%}%>
                <div class="modal-body">
                    <%if (user1 == null) {%>
                    <div class="row">
                        <h1 class="display-4">Agrega Productos al Carrito</h1>
                    </div>
                    <%} else {
                        Conexion conn2 = new Conexion();
                        WishList wish = new WishList(conn2);
                        LinkedList<WishList> listaDeseos = wish.ListarWishList(user1.getId_usuario());
                        for (WishList ws : listaDeseos) {%>

                    <div id="st_first" class="row">
                        <div id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <di>
                                    <img id="immodel" src="<%=ws.getImagen_pro()%>"> 
                                </di>
                            </div>
                        </div>
                        <div  id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <p id="vistaproducto"><%=ws.getNombre_pro()%> - <%=ws.getCaracteristica_pro()%></p>
                                </div>
                            </div>
                        </div>
                        <div id="stilo" class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3">
                            <div id="im_2" class="row">
                                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <p style="margin-bottom: 0%; " id="vistaproducto" >S\. <%=ws.getPrecio_unidad()%></p>
                                </div>                                   
                            </div>
                            <div  class="row" >
                                <div id="modal_basura" class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <div>
                                        <a type="button" class="close" href="ControladorWishlist?id_user=<%=ws.getId_usuario()%>&id_pro=<%=ws.getId_producto()%>&accion=BorrarProducto"><img id="bt_basura" src="admin/image/basura.png"></a>        
                                    </div>
                                </div>    
                            </div>    
                        </div>
                    </div>
                    <%  }
                        }
                    %>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>    
        </div>
    </div>
</div>
<!-- ****************************FIN DEL MODAL WISHLIST ***********************************-->  