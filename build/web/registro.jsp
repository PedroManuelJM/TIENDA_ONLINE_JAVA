<%-- 
    Document   : Registro
    Created on : 12-nov-2020, 11:16:31
    Author     : PCGAMING
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Usuario"%>
<%@page import="modelo.Conexion"%>
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
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Registrarse</title>
        <script type="text/javascript" src="/RapidFast/admin/js/validariniciar.js"></script>
        <link  href="admin/css/stylehome.css" rel="stylesheet" />
    </head>
   <!--BARRA DE NAVEGACION--> 
    <nav class="navbar navbar-expand-lg navbar navbar-dark" style="background-color: #696c8e;">
        <a class="navbar-brand" href="index.jsp">Inicio</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="registro.jsp">Registro <span class="sr-only">(current)</span></a>
            </li>
        
          </ul>
        </div>
      </nav>
    <!-- FIN BARRA DE NAVEGACION-->
    <%
        Usuario use = (Usuario) session.getAttribute("usuario");
        
        if(use!=null){
            request.getRequestDispatcher("Error404.jsp").forward(request, response);
        }
        Conexion con=new Conexion();
        Usuario us=new Usuario(con);
      
       LinkedList<Usuario> lista= us.generaridUsuario();
       int nro=10;
         for (int i = 0; i <lista.size(); i++) {
                 if(nro==lista.get(i).getId_usuario()){
                     nro++;
                 }
         }
    %>
    <body>
    <!--modals--> 
        <%@include file="modals.jsp" %>   
    <!-- FIN modals-->   
        <div class="container-lg">
            <div class="row">
                <div class="col-4 sm-4">
                    <br><br><br><br>
                    <img src="admin/image/tienda.png" class="imgRedonda-logo" style="">
                    <h6  style="margin-left: 10px;margin-top: 10px">Tienda Bodega Huascaran</h6>
                </div>
                <div class="col-6">
                    <form  name="iniciar" id="inciar" action="/RapidFast/mante_usuario" method="post" class="">    
                        <div class="container">
                            <div class="form-group">
                                <input type="hidden" class="form-control" value="<%=nro%>" name="id_usuario">   
                            </div>
                            <div id="alerta"></div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label class="col-form-label">Username</label>
                                        <input id="username" type="email" class="form-control"  name="username" placeholder="@example.com" required="true">
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label class="col-form-label">Password</label>
                                        <input  id="claves" type="password" class="form-control"  name="clave" placeholder="Ingrese contraseña" required="true">
                                    </div>
                                </div>   
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label class="col-form-label">Nombre:</label>
                                        <input id="nombre" type="text" class="form-control"  name="nombre" required="true"> 
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label class="col-form-label">Apellidos:</label>
                                        <input id="apellido" type="text" class="form-control"  name="apellido" required="true">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label  class="col-form-label">Tipo de documento:</label>
                                        <select id="tipodocumento" name="tipodocumento" class="custom-select" required="true">
                                            <option value=" " selected>Selecciona</option>
                                            <option value="DNI">DNI</option>
                                            <option value="Pasaporte">Pasaporte</option>
                                        </select>
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label  class="col-form-label">Documento:</label>
                                        <input id="nro_documento" type="text" class="form-control" name="nro_documento" required="true">
                                    </div>
                                </div>
                            </div>                
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" >
                                        <label  class="col-form-label" >Edad</label>
                                        <input id="edad" type="number" class="form-control" name="edad" required="true">
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6" style="padding-left: 6%;">
                                        <div class="row" >
                                            <label class="col-form-label">Genero</label> 
                                        </div>
                                        <div class="row" >
                                            <select name="genero" id="">
                                                <option value="">Seleccionar la opcion</option>
                                                <option value="masculino">Masculino</option>
                                                <option value="femenino">Femenino</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>          
                            <div class="form-group">
                                <label class="col-form-label">Direccion:</label>
                                <input id="direccion" type="text" class="form-control" name="direccion" required="true">
                            </div>    
                        </div>

                        <a href="index.jsp" type="button" class="btn btn-danger" style="margin-left: 120px; margin-bottom: 15px">Cancelar</a>
                        <input type="submit" class="btn btn-info" name="registrar" value="Registrarse" onclick="validariniciar()" style="margin-left: 120px; margin-bottom: 15px">
                        
                    </form> 
                            

                </div>
                <div class="col-2">


                </div>
            </div>
        </div>
                    <!-- FOOTER-->
        <%@include file="footer_index.jsp" %>                
    </body>
</html>
