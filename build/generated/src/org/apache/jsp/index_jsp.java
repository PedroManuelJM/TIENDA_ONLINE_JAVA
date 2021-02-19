package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Reporteproducto_masvendido;
import modelo.Conexion;
import java.util.LinkedList;
import modelo.producto;
import modelo.producto;
import modelo.Conexion;
import java.util.LinkedList;
import modelo.Usuario;
import modelo.WishList;
import java.util.LinkedList;
import modelo.carrito;
import modelo.Conexion;
import modelo.Usuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/navegacion.jsp");
    _jspx_dependants.add("/modals.jsp");
    _jspx_dependants.add("/footer_index.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/RapidFast/admin/css/stylehome.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/RapidFast/admin/css/bar.css\">\r\n");
      out.write("        <!--estilo buscador -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/RapidFast/admin/css/buscador.css\">\r\n");
      out.write("        <!--fin estilo buscador -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/EXAMEN_T3/admin/js/progresbar.js\"></script>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Magra&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <!--ICONOS -->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Rapidfast</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"admin/image/tienda.png\"/> \r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");

    Usuario user = (Usuario) session.getAttribute("usuario");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--BARRA DE NAVEGACION-->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark fixed-top\" id=\"\" style=\"background-color: #696c8e;\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">RapidFast <img src=\"admin/image/tienda.png\" style=\"width: 24px;margin-top: -4px\"></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <!-- AGREGUE EL BUSCADOR-->\r\n");
      out.write("        <input type=\"search\"  id=\"input-search\" placeholder=\"Buscar producto\" style=\"margin-right: 250px\"\r\n");
      out.write("               ");
 Conexion buscadorproducto=new Conexion();
                 producto bprod=new producto(buscadorproducto); 
      out.write("\r\n");
      out.write("         >\r\n");
      out.write("         <div class=\"content-search\">\r\n");
      out.write("             <div class=\"content-table\">\r\n");
      out.write("                 <table id=\"table\" >\r\n");
      out.write("                     <thead>\r\n");
      out.write("                         <tr>\r\n");
      out.write("                             <td></td>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                     </thead>\r\n");
      out.write("                     <tbody >\r\n");
      out.write("                         ");

                             LinkedList<producto> mostrarproductos;
                             mostrarproductos = bprod.ListarProducto();
                             for (producto j : mostrarproductos) {
                         
      out.write("\r\n");
      out.write("                         <tr>\r\n");
      out.write("                            <td style=\"background-color:#ffffff;\">\r\n");
      out.write("                                 <form method=\"post\"\r\n");
      out.write("\t\t\t\t    action=\"producto.jsp\">\r\n");
      out.write("                                     <a>\r\n");
      out.write("                                         <button type=\"submit\" class=\"SubmitButtonClass btn-light\" style=\"border:none; padding:0px\"> <img src=\"");
      out.print(j.getImagen());
      out.write("\"style=\"width:60px ;\"></button> \r\n");
      out.write("                                         <span style=\"margin-left:5px\">\r\n");
      out.write("                                             ");
      out.print(j.getNombre());
      out.write(" \r\n");
      out.write("                                             <h6 style=\"margin-left:68px;margin-top:-20px\">");
      out.print(j.getCaracteristicas());
      out.write("</h6>\r\n");
      out.write("                                         </span>\r\n");
      out.write("                                         <input type=\"hidden\" value=\"");
      out.print(j.getId_producto());
      out.write("\" name=\"id_prod\">  \r\n");
      out.write("\r\n");
      out.write("                                     </a>\r\n");
      out.write("                                 </form>   \r\n");
      out.write("                             </td>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                         ");
  }   
      out.write("    \r\n");
      out.write("                     </tbody>\r\n");
      out.write("                 </table>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>          \r\n");
      out.write("     \r\n");
      out.write("      <!-- FIN AGREGUE EL BUSCADOR-->\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            ");
if(user==null){
      out.write("\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"registro.jsp\">Registro<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"Recuperar_Cuenta.jsp\" style=\"\"> Olvidaste tu clave? </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                ");
 if (user != null) {
      out.write("\r\n");
      out.write("                <a class=\"nav-link\" href=\"Perfil.jsp\"><i class=\"fas fa-user-circle\"></i><h6 style=\"margin-left:30px;margin-top:-23px\">");
      out.print(user.getNombre());
      out.write("</h6></a>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        ");
 if (user == null) {
      out.write("\r\n");
      out.write("            <a href=\"#\" type=\"button\" class=\"btn btn-light\" data-toggle=\"modal\" data-target=\"#ModalLogin\" style=\"margin-right: 50px\">Ingresar</a>\r\n");
      out.write("        ");
} else {
      out.write("\r\n");
      out.write("            <!--  BOTON DE CARRITO DE COMPRA**-->\r\n");
      out.write("            <div>\r\n");
      out.write("                <a href=\"\" type=\"button\" class=\"btn btn-light\" data-toggle=\"modal\" data-target=\"#mymodal\">\r\n");
      out.write("                    <img id=\"carro\" src=\"/RapidFast/admin/image/carrito.png\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--  FIN BOTON DE CARRITO DE COMPRA**-->\r\n");
      out.write("\r\n");
      out.write("            <!--     BOTON DE WISHLIST *  ***-->\r\n");
      out.write("            <div id=\"wish\">\r\n");
      out.write("                <a href=\"\" type=\"button\" class=\"btn btn-light\" data-toggle=\"modal\" data-target=\"#ModalWishlist\">\r\n");
      out.write("                    <img id=\"wishlist\" src=\"admin/image/wishlist.png\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CerrarSesion\" style=\"color: #ff3333\"><i class=\"fas fa-power-off\"></i></a>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- FIN -- BARRA DE NAVEGACION-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row \">\r\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\" style=\"padding:0\">\r\n");
      out.write("                <div class=\"row\" id=\"panel\" style=\"margin:0\">\r\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("                        <div id=\"vista\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <ul class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#vista\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#vista\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#vista\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"carousel-inner\">\r\n");
      out.write("                                <div class=\"carousel-item active\">\r\n");
      out.write("                                    <img id=\"spon\" src=\"admin/image/manzana.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"carousel-item\">\r\n");
      out.write("                                    <img id=\"spon\" src=\"admin/image/pollo.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"carousel-item\">\r\n");
      out.write("                                    <img id=\"spon\" src=\"admin/image/todo.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"carousel-control-prev\" href=\"#vista\" data-slide=\"prev\">\r\n");
      out.write("                                <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"carousel-control-next\" href=\"#vista\" data-slide=\"next\">\r\n");
      out.write("                                <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("\r\n");
      out.write("        <!-- VISTA DE LOS PRODUCTOS -->  \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">    \r\n");
      out.write("                ");

                    Conexion conn = new Conexion();
                    producto pro = new producto(conn);
                    LinkedList<producto> lista = pro.ListarProducto();
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5\">\r\n");
      out.write("                        <div class=\"row\" id=\"promit\">\r\n");
      out.write("                            ");
 for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i).getStock() > 0) {
      out.write("\r\n");
      out.write("                            <div  id=\"inprod\" class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                                <div id=\"margen\">\r\n");
      out.write("                                    <img  class=\"img-thumbnail\" id=\"cargaimagen\" src=\"");
      out.print(lista.get(i).getImagen());
      out.write("\">\r\n");
      out.write("                                    <p id=\"product\" >");
      out.print(lista.get(i).getNombre());
      out.write(" </p>\r\n");
      out.write("                                    <div id=\"produ\"class=\"row\">\r\n");
      out.write("                                        <div class=\"col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8\">\r\n");
      out.write("                                            <div class=\"container\">\r\n");
      out.write("                                                <input id=\"VerProducto\" type=\"button\" class=\"btn btn-danger\" value=\"Ver Producto\" onclick=\"verproducto(");
      out.print(lista.get(i).getId_producto());
      out.write(")\" style=\"margin-left: -10px\">                                          \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <!-- agregasr-->\r\n");
      out.write("                                                <a id=\"canasta\" href=\"\" class=\"btn btn-success disabled\" ><img id=\"newc\" src=\"admin/image/tienda.png\"></a>\r\n");
      out.write("                                                <!-- /////////////-->         \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div id=\"stockkk\">\r\n");
      out.write("                                                <span style=\"color: white;\">");
      out.print(lista.get(i).getStock());
      out.write("</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>        \r\n");
      out.write("                            </div>          \r\n");
      out.write("                            ");
}
                                }
      out.write("  \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>           \r\n");
      out.write("        </div>                    \r\n");
      out.write("\r\n");
      out.write("        <!--  FIN --  VISTA DE LOS PRODUCTOS -->   \r\n");
      out.write("        ");

            Conexion connCarrusel = new Conexion();
            Reporteproducto_masvendido carrusel = new Reporteproducto_masvendido(connCarrusel);
            LinkedList<Reporteproducto_masvendido> lista_carrusel = carrusel.ProductomasVendido();
      out.write("\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5\">\r\n");
      out.write("                        <div class=\"row\" id=\"promit\">\r\n");
      out.write("                            <span id=\"p_caro\">Productos mas vendidos</span>  \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 mt-5\">\r\n");
      out.write("                        <div class=\"row\" id=\"promit\">\r\n");
      out.write("                            ");
for (Reporteproducto_masvendido c : lista_carrusel) {
                            
      out.write("\r\n");
      out.write("                            <div  id=\"inprod\" class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                                <div id=\"margen\">\r\n");
      out.write("                                    <img  class=\"img-thumbnail\" id=\"cargaimagen\" src=\"");
      out.print(c.getImg());
      out.write("\">\r\n");
      out.write("                                    <p id=\"product\" >");
      out.print(c.getProducto());
      out.write("</p>\r\n");
      out.write("                                    <div id=\"produ\"class=\"row\">\r\n");
      out.write("                                        <div class=\"col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8\">\r\n");
      out.write("                                            <div class=\"container\">\r\n");
      out.write("                                                <form method=\"post\" action=\"producto.jsp\" >\r\n");
      out.write("                                                    <input type=\"hidden\" value=\"");
      out.print(c.getId());
      out.write("\" name=\"id_prod\">  \r\n");
      out.write("                                                    <input type=\"submit\" id=\"btn\" class=\"btn btn-danger\" value=\"Ver Producto\"> \r\n");
      out.write("                                                </form>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <!-- agregasr-->\r\n");
      out.write("                                                <a id=\"canasta\" href=\"\" class=\"btn btn-success disabled\" ><img id=\"newc\" src=\"admin/image/tienda.png\"></a>\r\n");
      out.write("                                                <!-- /////////////-->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div id=\"stockkk\">\r\n");
      out.write("                                                <span style=\"color: white;\">");
      out.print(c.getStock());
      out.write("</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>        \r\n");
      out.write("                            </div> \r\n");
      out.write("                            ");
    }
      out.write(" \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("\r\n");
      out.write("        <!-- MODALS -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- MODAL LOGIN -->    \r\n");
      out.write("<div class=\"container\">              \r\n");
      out.write("    <div class=\"modal fade\" id=\"ModalLogin\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AutorizarUsuario\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <img src=\"admin/image/tienda.png\" class=\"img-fluid\" style=\"height: 50px\">\r\n");
      out.write("\r\n");
      out.write("                        <h2 style=\"margin-left: 130px\">RapidFast</h2>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-group mb-4\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <div class=\"input-group-text\"><i class=\"material-icons\">person</i></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input id=\"correo\" type=\"text\" name=\"user\" class=\"form-control\" placeholder=\"Nombre de Usuario\" required=\"\">                                     \r\n");
      out.write("                        </div> <!--input-group mb-4 -->\r\n");
      out.write("                        <div class=\"input-group mb-4\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <div class=\"input-group-text\"><i class=\"material-icons\">lock</i></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input id=\"password\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Contraseña\" required=\"\">  \r\n");
      out.write("                        </div> <!--input-group mb-4 --> \r\n");
      out.write("                        <a class=\"nav-link\" href=\"Recuperar_Cuenta.jsp\" style=\"margin-left: 290px\"> Olvidastes tu clave? </a>                           \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-light\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-dark\" name=\"registrar\" value=\"Ingresar\" onclick=\"\">                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- FIN MODAL LOGIN-->   \r\n");
      out.write("\r\n");
      out.write("<!-- **************************** MODAL CARRITO DE COMPRA ***********************************-->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"modal fade\" id=\"mymodal\">\r\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h1 id=\"carrito\"class=\"modal-title display-4\">Carrito</h1>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>  \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    ");

                        Usuario user1 = (Usuario) session.getAttribute("usuario");
                        Integer id_venta1 = (Integer) session.getAttribute("idventa");
                        if (user1 == null) {
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <h1 class=\"display-4\">Agrega Productos al Carrito</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
} else {
                        Conexion conn1 = new Conexion();
                        carrito carrito = new carrito(conn1);
                        LinkedList<carrito> carrito_usuario = carrito.listarCarrito(id_venta1);
                        for (int i = 0; i < carrito_usuario.size(); i++) {
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"st_first\" class=\"row\">\r\n");
      out.write("                        <div id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <di>\r\n");
      out.write("                                    <img id=\"immodel\" src=\"");
      out.print(carrito_usuario.get(i).getImagen());
      out.write("\"> \r\n");
      out.write("                                </di>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div  id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("                                    <p id=\"vistaproducto\">");
      out.print(carrito_usuario.get(i).getNom_product());
      out.write(" - ");
      out.print(carrito_usuario.get(i).getCaracat());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div  id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                    <p id=\"vistaproducto\">");
      out.print(carrito_usuario.get(i).getDes_marca());
      out.write(" / ");
      out.print(carrito_usuario.get(i).getDes_categoria());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                    <p id=\"vistaproducto\">");
      out.print(carrito_usuario.get(i).getCantidad());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                    <p style=\"margin-bottom: 0%; \" id=\"vistaproducto\" >S\\. ");
      out.print(carrito_usuario.get(i).getPrecio_unidad());
      out.write("</p>\r\n");
      out.write("                                    <p id=\"vistaproducto\" >");
      out.print(carrito_usuario.get(i).getUnidad());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                    <p id=\"vistaproducto\">S\\. ");
      out.print(carrito_usuario.get(i).getPrecio_total());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div  class=\"row\" >\r\n");
      out.write("                                <div id=\"modal_basura\" class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a type=\"button\" class=\"close\" href=\"/RapidFast/mante_carrito?car=");
      out.print(carrito_usuario.get(i).getId_venta());
      out.write("&pro=");
      out.print(carrito_usuario.get(i).getId_product());
      out.write("\"><img id=\"bt_basura\" src=\"/EXAMEN_T3/admin/image/basura.png\"></a>        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                   \r\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    ");
 if (user1 != null) {
      out.write("\r\n");
      out.write("                    <a href=\"mante_venta?id_user=");
      out.print(user1.getId_usuario());
      out.write("&id_ven=");
      out.print(id_venta1);
      out.write("\" type=\"button\" class=\"btn btn-success\">Comprar</a>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>                \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>                            \r\n");
      out.write("<!-- ********************* FIN - -  MODAL DE CARRITO DE COMPRA    ************ -->\r\n");
      out.write("\r\n");
      out.write("<!-- **************************** MODAL DE WISH LIST ***********************************-->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"modal fade\" id=\"ModalWishlist\">\r\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h1 id=\"carrito\"class=\"modal-title display-4\">Lista de deseos</h1>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>  \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
if (user1 == null) {
                                    } else {
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    ");
if (user1 == null) {
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <h1 class=\"display-4\">Agrega Productos al Carrito</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
} else {
                        Conexion conn2 = new Conexion();
                        WishList wish = new WishList(conn2);
                        LinkedList<WishList> listaDeseos = wish.ListarWishList(user1.getId_usuario());
                        for (WishList ws : listaDeseos) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"st_first\" class=\"row\">\r\n");
      out.write("                        <div id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <di>\r\n");
      out.write("                                    <img id=\"immodel\" src=\"");
      out.print(ws.getImagen_pro());
      out.write("\"> \r\n");
      out.write("                                </di>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div  id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("                                    <p id=\"vistaproducto\">");
      out.print(ws.getNombre_pro());
      out.write(" - ");
      out.print(ws.getCaracteristica_pro());
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"stilo\" class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("                            <div id=\"im_2\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                    <p style=\"margin-bottom: 0%; \" id=\"vistaproducto\" >S\\. ");
      out.print(ws.getPrecio_unidad());
      out.write("</p>\r\n");
      out.write("                                </div>                                   \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div  class=\"row\" >\r\n");
      out.write("                                <div id=\"modal_basura\" class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a type=\"button\" class=\"close\" href=\"ControladorWishlist?id_user=");
      out.print(ws.getId_usuario());
      out.write("&id_pro=");
      out.print(ws.getId_producto());
      out.write("&accion=BorrarProducto\"><img id=\"bt_basura\" src=\"admin/image/basura.png\"></a>        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
  }
                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ****************************FIN DEL MODAL WISHLIST ***********************************-->  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal Productos quitados del carrito por falta de stock-->\r\n");
      out.write("        <div class=\"modal fade\" id=\"ModalProductosQuitados\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title\" id=\"exampleModalLabel\">Productos quitados</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <h6>Los siguientes productos fueron quitados, debido a que ya no contamos con la cantidad solicitada.</h6>\r\n");
      out.write("                        \r\n");
      out.write("                        <input id=\"quitarProd\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${QuitarProducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <table id=\"table\" class=\"dataTable no-footer\" role=\"grid\" aria-describedby=\"table_info\" style=\"width: 100%;\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr role=\"row\"><td class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"table\" rowspan=\"1\" colspan=\"1\" aria-label=\": activate to sort column descending\" style=\"width: 0px;\" aria-sort=\"ascending\"></td></tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Aceptar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            function verproducto(idpro)\r\n");
      out.write("            {\r\n");
      out.write("                window.open(\"/RapidFast/producto.jsp?id_prod=\" + idpro + \"\", \"_self\");\r\n");
      out.write("            }\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                try {\r\n");
      out.write("                    let QuitarProducto = document.getElementById('quitarProd').value;\r\n");
      out.write("                    if (QuitarProducto === \"true\") {\r\n");
      out.write("                        $('#ModalProductosQuitados').modal('show');\r\n");
      out.write("                    }\r\n");
      out.write("                } catch (e) {\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>  \r\n");
      out.write("\r\n");
      out.write("        <!-- FOOTER-->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" id=\"foot\">\r\n");
      out.write("    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h2>Contactos</h2><br>\r\n");
      out.write("                <ul class=\"nav nav-tabs nav-justified\" role=\"tablist\">\r\n");
      out.write("                    <li class=\"nav-item\" >\r\n");
      out.write("                        <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#home\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\" >\r\n");
      out.write("                        <a class=\"nav-link \" data-toggle=\"tab\" href=\"#nosotros\">Nosotros</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\" >\r\n");
      out.write("                        <a class=\"nav-link \" data-toggle=\"tab\" href=\"#map\">Ubicanos</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"tab-content\">\r\n");
      out.write("                    <div id=\"home\" class=\"container tab-pane active\"><br>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                <div class=\"input-group mb-3\">\r\n");
      out.write("                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                        <a class=\"btn btn-outline-success\" href=\"mailto:someone@example.com\">@</a>  \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" placeholder=\"@example.com\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                <span>Comunicate con nosotros para mas informacion </span><a href=\"\"><u>Terminos y condiciones</u></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"nosotros\" class=\"container tab-pane fade\"><br>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 \"id=\"rig\">\r\n");
      out.write("                                        <img id=\"ndato\" src=\"admin/image/google.png\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8\">\r\n");
      out.write("                                        <p id=\"sip\">bodegahuascaran@gmail.com</p>\r\n");
      out.write("                                        <p id=\"sip\">serviciohuascaran@RapidFast.com</p>\r\n");
      out.write("                                        <p id=\"sip\">serviciohuascaran@RapidFast.com</p>\r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 \"id=\"rig\">\r\n");
      out.write("                                        <img id=\"ndato\" src=\"admin/image/what.png\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-12 col-sm-12 col-md-8 col-lg-8 col-xl-8\">\r\n");
      out.write("                                        <p id=\"sip\">928745689</p>\r\n");
      out.write("                                        <p id=\"sip\">982617425</p>\r\n");
      out.write("                                        <p id=\"sip\">978569102</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"map\" class=\"container tab-pane fade\"><br>\r\n");
      out.write("                        <h3>Ubicanos</h3>\r\n");
      out.write("                        <iframe id=\"foot2\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5516.445867042784!2d-77.03057059787703!3d-12.13155461355248!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105b7e1b4b5a533%3A0xa549043226dcfb18!2sLarcomar!5e0!3m2!1ses-419!2spe!4v1592413023183!5m2!1ses-419!2spe\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>     \r\n");
      out.write("        </footer> \r\n");
      out.write("    </div>        \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md  navbar-dark fixed-bottom \" id=\"\" style=\"background-color:#696c8e;\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item \" >\r\n");
      out.write("                    <img id=\"logo2\" src=\"admin/image/logo2.png\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item \" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"https://www.facebook.com\" target=\"_blank\"><img  id=\"logoabajo\" src=\"admin/image/face.png\" class=\"rounded-circle\"></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"https://www.instagram.com/?hl=es-la\" target=\"_blank\"><img id=\"logoabajo\" src=\"admin/image/insta.png\" class=\"rounded-circle\"></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"https://twitter.com/login?lang=es\" target=\"_blank\"><img id=\"logoabajo\" src=\"admin/image/twitter.png\" class=\"rounded-circle\"></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"https://www.youtube.com/\" target=\"_blank\"><img id=\"logoabajo\" src=\"admin/image/youtube.png\" class=\"rounded-circle\"></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\" style=\"color: #ffffff; margin-left: 650px\"><img id=\"logoabajo\" src=\"admin/image/iconobodega.png\" class=\"rounded-circle\" style=\"margin-left:-90px;width:32px;height:32px\"> Bodega Huascaran</a>\r\n");
      out.write("                    <span style=\"color: #ffffff; margin-left: 600px\">RUC: 10093204714</span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery  PARA EL BUSCADOR-->\r\n");
      out.write("<script src=\"/RapidFast/admin/js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"/RapidFast/admin/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- DataTables -->\r\n");
      out.write("<script src=\"/RapidFast/admin/js/jquery.dataTables_buscador.min.js\"></script>\r\n");
      out.write("<script src=\"/RapidFast/admin/js/search.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/RapidFast/admin/js/search.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productosQuitados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("productoQuitado");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr role=\"row\" class=\"odd\">\r\n");
          out.write("                                        <td style=\"background-color:#ffffff;\" class=\"sorting_1\">\r\n");
          out.write("                                            <a>\r\n");
          out.write("                                                <button type=\"submit\" class=\"SubmitButtonClass btn-light\" style=\"border:none; padding:0px\"> <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productoQuitado.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width:60px ;\"></button> \r\n");
          out.write("                                                <span style=\"margin-left:5px\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productoQuitado.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                    <h6 style=\"margin-left:68px;margin-top:-20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productoQuitado.getCaracteristicas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                                </span>\r\n");
          out.write("                                                <input type=\"hidden\" value=\"6\" name=\"id_prod\">  \r\n");
          out.write("\r\n");
          out.write("                                            </a> \r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
