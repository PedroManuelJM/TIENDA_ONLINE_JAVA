<%-- 
    Document   : Error404
    Created on : 12-nov-2020, 17:18:20
    Author     : PCGAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://unpkg.com/scrollreveal/dist/scrollreveal.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  href="/RapidFast/admin/css/styleRegistro.css" rel="stylesheet" />
        <title>Ups! parece que hubo un error</title>       
    </head>
       <!--BARRA DE NAVEGACION--> 
        <!--BARRA DE NAVEGACION--> 
    <nav class="navbar navbar-expand-lg navbar navbar-dark " style="background-color: #696c8e;">
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
          
        <section class="imagen-section" id="imagen1">
                   <div class="container header-content-left">                             
                           <div  class="justify-content-center row">            
                                   <a href="index.jsp" type="button" class="btn btn-info">Ir a la Pagina Principal</a>      
                           </div> 
                    </div>
            <br><br><br><br>
        </section>     
        
    </body>
        <!-- SCRIPTS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
 
    <!-- SCROOLL REVEAL SCRIPT -->
  <script>
   window.sr = ScrollReveal();
   
  sr.reveal('.header-content-left', {
      duration: 2000,
      origin: 'top',
      distance: '300px'
    });

    sr.reveal('.header-content-right', {
      duration: 2000,
      origin: 'right',
      distance: '300px'
    });

    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
      anchor.addEventListener('click', function (e) {
        e.preventDefault();

        document.querySelector(this.getAttribute('href')).scrollIntoView({
          behavior: 'smooth'
        });
      });
    });
    </script>
</html>
