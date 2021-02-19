<%-- 
    Document   : RecuperarCuenta
    Created on : 12-nov-2020, 12:19:49
    Author     : PCGAMING
--%>

<%@page import="modelo.Usuario"%>
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
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">       
        <!---->
        <script src="https://cdn.rawgit.com/PascaleBeier/bootstrap-validate/v2.2.0/dist/bootstrap-validate.js" ></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar Cuenta</title>
    </head>
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
    <body>
        <%
        Usuario use = (Usuario) session.getAttribute("usuario");
        
        if(use!=null){
            request.getRequestDispatcher("Error404.jsp").forward(request, response);
        }
        %>
        
    <section class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4">
                        
                    </div>
                    <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4">
                        <div id="alerta"></div>
                        <br>
                        <div class="card card-primary">
                            <br>
                            <div id="titulo" class="card-header text-center">
                                <h3>Recupera tu cuenta </h3>  
                                <span>Bodega Huascaran</span>
                            </div>
                            <div class="text-center">
                                <br>
                                <img src="/RapidFast/admin/image/logo.png" >
                            </div> 
                            <form action="/RapidFast/RecuperarCuenta" id="recuperarcuenta1" name="recuperarcuenta1"  method="post">
                                <div class="card-body">
                                   <div class="input-group mb-4">
                                         <div class="input-group-prepend">
                                             <div class="input-group-text"><i class="fa fa-envelope"></i></div>
                                         </div>
                                       	
                                       <input id="correo" type="text"  name="correo"  class="form-control"  placeholder="Ingrese su correo electrónico" required=""/>
                                    </div> <!--input-group mb-4 -->
                                       
                                   
                                </div>
                                <div class="card-footer">
                                    <input class="form-control btn btn-success" type="submit" name="btnEnviar"  id="btnEnviar" value="Enviar" onclick="validar_recpcuenta();"> 
                                </div>
                            </form>
                            <script>
                               bootstrapValidate('#correo', 'email:Ingrese un correo válido!')          
                            </script>
                              
                        </div>
                    </div>
                </div>
            </div>               
        </section>
    
        <!-- FOOTER-->
        <%@include file="footer_index.jsp" %>    

    </body>
</html>
