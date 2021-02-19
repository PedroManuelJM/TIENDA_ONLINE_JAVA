<%-- 
    Document   : footer_index
    Created on : 15-nov-2020, 23:19:58
    Author     : PCGAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="row" id="foot">
    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
        <footer>
            <div class="container">
                <h2>Contactos</h2><br>
                <ul class="nav nav-tabs nav-justified" role="tablist">
                    <li class="nav-item" >
                        <a class="nav-link active" data-toggle="tab" href="#home">Home</a>
                    </li>
                    <li class="nav-item" >
                        <a class="nav-link " data-toggle="tab" href="#nosotros">Nosotros</a>
                    </li>
                    <li class="nav-item" >
                        <a class="nav-link " data-toggle="tab" href="#map">Ubicanos</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div id="home" class="container tab-pane active"><br>
                        <div class="row">
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <a class="btn btn-outline-success" href="mailto:someone@example.com">@</a>  
                                    </div>
                                    <input type="email" class="form-control" placeholder="@example.com">
                                </div>
                            </div>
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                <span>Comunicate con nosotros para mas informacion </span><a href=""><u>Terminos y condiciones</u></a>
                            </div>
                        </div>
                    </div>
                    <div id="nosotros" class="container tab-pane fade"><br>
                        <div class="row">
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 "id="rig">
                                        <img id="ndato" src="admin/image/google.png">
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
                                        <p id="sip">bodegahuascaran@gmail.com</p>
                                        <p id="sip">serviciohuascaran@RapidFast.com</p>
                                        <p id="sip">serviciohuascaran@RapidFast.com</p>
                                        <p></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                <div class="row">
                                    <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 "id="rig">
                                        <img id="ndato" src="admin/image/what.png">
                                    </div>
                                    <div class="col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
                                        <p id="sip">928745689</p>
                                        <p id="sip">982617425</p>
                                        <p id="sip">978569102</p>
                                    </div>
                                </div>
                            </div>
                        </div>  
                    </div>
                    <div id="map" class="container tab-pane fade"><br>
                        <h3>Ubicanos</h3>
                        <iframe id="foot2" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5516.445867042784!2d-77.03057059787703!3d-12.13155461355248!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105b7e1b4b5a533%3A0xa549043226dcfb18!2sLarcomar!5e0!3m2!1ses-419!2spe!4v1592413023183!5m2!1ses-419!2spe" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                    </div>
                </div>
            </div>     
        </footer> 
    </div>        
</div>
<div class="row">
    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
        <nav class="navbar navbar-expand-md  navbar-dark fixed-bottom " id="" style="background-color:#696c8e;">
            <ul class="navbar-nav">
                <li class="nav-item " >
                    <img id="logo2" src="admin/image/logo2.png">
                </li>
                <li class="nav-item " >
                    <a class="nav-link" href="https://www.facebook.com" target="_blank"><img  id="logoabajo" src="admin/image/face.png" class="rounded-circle"></a>
                </li>
                <li class="nav-item" >
                    <a class="nav-link" href="https://www.instagram.com/?hl=es-la" target="_blank"><img id="logoabajo" src="admin/image/insta.png" class="rounded-circle"></a>
                </li>
                <li class="nav-item" >
                    <a class="nav-link" href="https://twitter.com/login?lang=es" target="_blank"><img id="logoabajo" src="admin/image/twitter.png" class="rounded-circle"></a>
                </li>
                <li class="nav-item" >
                    <a class="nav-link" href="https://www.youtube.com/" target="_blank"><img id="logoabajo" src="admin/image/youtube.png" class="rounded-circle"></a>
                </li>
                <li class="nav-item" >
                    <a class="nav-link" href="#" style="color: #ffffff; margin-left: 650px"><img id="logoabajo" src="admin/image/iconobodega.png" class="rounded-circle" style="margin-left:-90px;width:32px;height:32px"> Bodega Huascaran</a>
                    <span style="color: #ffffff; margin-left: 600px">RUC: 10093204714</span>
                </li>
            </ul>
        </nav>
    </div>
</div>

<!-- jQuery  PARA EL BUSCADOR-->
<script src="/RapidFast/admin/js/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="/RapidFast/admin/js/bootstrap.bundle.min.js"></script>
<!-- DataTables -->
<script src="/RapidFast/admin/js/jquery.dataTables_buscador.min.js"></script>
<script src="/RapidFast/admin/js/search.js"></script>
<script type="text/javascript" src="/RapidFast/admin/js/search.js"></script>