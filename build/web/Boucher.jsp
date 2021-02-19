<%-- 
    Document   : Boucher
    Created on : 14-nov-2020, 11:14:58
    Author     : PCGAMING
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Reporte_cliente"%>
<%@page import="modelo.venta"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="/EXAMEN_T3/admin/css/bouch.css">
        <link href="https://fonts.googleapis.com/css2?family=Taviraj:wght@500&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=IM+Fell+Great+Primer+SC&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Josefin+Slab:ital,wght@0,600;0,700;1,600&display=swap" rel="stylesheet">
        <title>Factura</title>
    </head>
    <body>
        <style>
            @media print {
                .btn {
                    display: none !important;
                }
            }
        </style>      

        <span>${id_us} / ${id_ve}</span>
        <form>
            <div class="row">
                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                    <div class="row">
                        <div id="pad" class="col-12 col-sm-12 col-md-7 col-lg-7 col-xl-7">
                            <img id="log" src="/RapidFast/admin/image/logo2.png">
                        </div>
                        <div id="pad" class="col-12 col-sm-12 col-md-5 col-lg-5 col-xl-5">
                            <p id="ti">Factura</p>
                        </div>
                    </div>
                    <a href="index.jsp" type="button" class="btn btn-info" style="margin-left: 10px;margin-top: -40px">Ir a la Pagina Principal</a> 
                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                            <div id="ds2" class="row">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <div id="ms2" class="row">
                                        <p id="entr">NUMERO</p>
                                    </div>
                                    <div class="row">
                                        <p id="res">000${id_ve}</p>
                                    </div>
                                </div>
                            </div>
                            <div id="ds2" class="row">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12" >
                                    <div id="ms2" class="row">
                                        <p id="entr">FECHA</p>
                                    </div>
                                    <div class="row">
                                        <p id="res">${fecha} ${hora}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-10 col-lg-10 col-xl-10">
                            <div class="row">
                                <div id="ds1" class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                    <P id="en_to">${tipo}</P>
                                    <P id="en_tcli">${nombre_usuario}</P>
                                    <P id="en_to">${direccion}</P>
                                    <P id="en_to">${dni}</P>
                                    <P id="en_to">${correo}</P>
                                </div>
                                <div id="ds1" class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">              
                                    <P id="en_to">Bodega Huascaran</P>
                                    <P id="en_to">Jro las chamarras 547</P>
                                    <P id="en_to">987845986</P>
                                    <P id="en_to">bodegahuascaran@gmail.com</P>
                                    <img src="admin/image/iconobodega.png" style="width: 164px; margin-left:225px;margin-top: -90px">
                                </div>
                            </div>
                            <div class="row">
                                <table class="table table-striped">
                                    <thead class="table-info">
                                    <th id="id_t">DESCRIPCIÓN</th>
                                    <th id="id_t">CARACTERISTICA</th>
                                    <th id="id_t">CANTIDAD</th>
                                    <th id="id_t">PRECIO UNIDAD</th>
                                    <th id="id_t">IMPORTE</th>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${productoVoucher}" var="producto">
                                        <tr>      
                                            <td id="id_d" >${producto.getNom_pro() }</td>
                                            <td id="id_d" >${producto.getCarac() }</td>
                                            <td id="id_d" >${producto.getC_comprada() }</td>
                                            <td id="id_d" pattern="^\d*(\.\d{0,2})?$">S/. ${producto.getP_unitario() }</td>
                                            <td id="id_d" pattern="^\d*(\.\d{0,2})?$">S/. ${producto.getPreciostotal() }</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="row">
                                <div class="col-12 col-sm-12 col-md-7 col-lg-7 col-xl-7">

                                </div>
                                <div class="col-12 col-sm-12 col-md-5 col-lg-5 col-xl-5">
                                    <table id="tabl" class="table table-striped">
                                        <tbody>
                                            <tr>
                                                <td id="p_s">SUBTOTAL</td>
                                                <td id="p_le" pattern="^\d*(\.\d{0,2})?$">S/. ${subtotal}</td>
                                            </tr>
                                            <tr>
                                                <td id="p_s">IGV(18%)</td>
                                                <td id="p_le" pattern="^\d*(\.\d{0,2})?$">S/. ${total}</td>
                                            </tr>
                                            <tr>
                                                <td id="p_s" class="table-danger">TOTAL</td>
                                                <td id="p_le" class="table-danger">S/. ${totaltal}</td>
                                            </tr>                                
                                        </tbody>
                                    </table>                
                                            <button  type="button"id="btnImprimir" class="mt-2 btn btn-success" onclick="window.print()">Imprimir</button>                                                       
                                </div>
                            </div>        
                        </div>
                    </div>
                </div>
            </div>                
        </form>

        <form action="https://www.paypal.com/cgi-bin/webscr" method="post" style="margin-top:-10px; margin-left: 300px">

            <input type="hidden" name="cmd" value="_ext-enter" />
            <input type="hidden" name="redirect_cmd" value="_xclick" />
            <input type="hidden" name="business" value="rapidfast2020@gmail.com" />
            <input type="hidden" name="item_name" value="Productos varios" />
            <input type="hidden" name="quantity" value="1" />
            <input type="hidden" name="amount" value="${TotalDolar}" />
            <input type="hidden" name="currency_code" value="USD" />
            <input type="hidden" name="return" value="http://localhost:8080/EXAMEN_T3/index.jsp" />
            <input type="hidden" name="bn" value="PP-BuyNowBF:btn_buynowCC_LG.gif:NonHostedGuest" />
            <input type="image" src="http://www.paypal.com/es_XC/i/btn/x-click-but01.gif" border="0" name="submit" alt="Pagar para completar la compra." />

        </form>
        <br>
    </body>
</html>

