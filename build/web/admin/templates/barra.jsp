
<%@page import="modelo.Usuario"%>
<body class="hold-transition sidebar-mini">
      <%
      Usuario u = (Usuario)session.getAttribute("usuario");
      if(u==null){
          response.sendRedirect("login.jsp");
        }
      %>
    <!-- Site wrapper -->
    <div class="wrapper">  
        <nav class="main-header navbar navbar-expand navbar-white navbar-light">
            <!-- Left navbar links -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
                </li>
            </ul>

            <!-- Right navbar links -->
            <ul class="navbar-nav ml-auto">
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">

                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="hidden-xs"><i class="fa fa-circle text-success"></i> ${usuario.nombre}</span>
                            </a>
                            <ul class="dropdown-menu">

                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-success btn-flat">Ajustes</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="${pageContext.request.contextPath}/CerrarSesion" class="btn btn-success btn-flat">Cerrar Sesi�n</a>
                                    </div>
                                </li>
                            </ul>
                        </li>

                    </ul>
                </div>
            </ul>

        </nav>
    </div>
