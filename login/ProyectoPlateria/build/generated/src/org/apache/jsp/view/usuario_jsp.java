package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/../WEB-INF/template/headerView.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/navMainView.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/footer.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/footerView.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta charset=\"utf-8\"> \n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../css/styleMain.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../css/styleFooter.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>Menu Principal</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   ");
      out.write("<nav class=\"navbar navbar-inverse top-navbar\" id=\"top-nav\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("         \n");
      out.write("        <a   href=\"javascript:;\" class=\"sidebar-toggle\">\n");
      out.write("        <i class=\"fa fa-bars\"></i></a>\n");
      out.write("        <span class=\"close-btn\" id=\"hide-btn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></span>\n");
      out.write("        \n");
      out.write("        <a href=\"../login.jsp\"><span id=\"btn-salir\"  class=\"fa fa-sign-out\"></span></a>\n");
      out.write("                              \n");
      out.write("        </div>  \n");
      out.write("    </nav>    \n");
      out.write("<!--    top nav end===========-->\n");
      out.write("    \n");
      out.write("    <!-- begin SIDE NAV USER PANEL -->     \n");
      out.write("<div class=\"container-1\" id=\"user-profil\" style=\"transition: 5s\">                  \n");
      out.write("    <ul id=\"side\" class=\"nav navbar-nav-1 side-nav\">\n");
      out.write("    \n");
      out.write(" <li class=\"side-user\">  \n");
      out.write("  <img class=\"img-circle\" src=\"\" alt=\"  \">\n");
      out.write("    <p class=\"welcome\"><i class=\"fa fa-key\"></i> Ingresaste como</p>\n");
      out.write("    <p class=\"name tooltip-sidebar-logout\"> Christan Rios\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-sign-out\"></i></a>\n");
      out.write("    </p>        \n");
      out.write(" </li>\n");
      out.write("    \n");
      out.write("    <li class=\"nav-search\">\n");
      out.write("   <form class=\"navbar-form\">\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("     <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("     <div class=\"input-group-btn\">\n");
      out.write("     <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("     <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("     </button>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("  </form>\n");
      out.write(" </li>\n");
      out.write("    \n");
      out.write("    <li class=\"dashboard\">\n");
      out.write("   <a class=\"active\" href=\"../main.jsp\"><i class=\"fa fa-dashboard\"></i> Menu Principal</a>\n");
      out.write(" </li>\n");
      out.write("    \n");
      out.write("    <li class=\"panel\">\n");
      out.write("   <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#charts\">\n");
      out.write("   <i class=\"fa fa-bar-chart-o\"></i> Reportes <i class=\"fa fa-caret-down pull-right\"></i>\n");
      out.write("   </a>\n");
      out.write("    \n");
      out.write("  <ul class=\"collapse nav\" id=\"charts\">\n");
      out.write("    <li>\n");
      out.write("        <a href=\"../view/reportesVenta.jsp\"><i class=\"fa fa-angle-double-right\"></i> Reportes de ventas</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Reporte de Ingresos</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</li>\n");
      out.write("    \n");
      out.write("    <li class=\"panel\">\n");
      out.write("   <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#calendar\">\n");
      out.write("   <i class=\"fa fa-tasks\"></i> Gestion productos <i class=\"fa fa-caret-down pull-right\"></i>\n");
      out.write("   </a>\n");
      out.write("    \n");
      out.write("  <ul class=\"collapse nav\" id=\"calendar\">\n");
      out.write("    <li>\n");
      out.write("        <a href=\"../view/productos.jsp\"><i class=\"fa fa-angle-double-right\"></i> Gestion productos</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"../view/solicitaPedido.jsp\"><i class=\"fa fa-angle-double-right\"></i> Solicitar pedido</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</li>\n");
      out.write("    <li class=\"panel\">\n");
      out.write("   <a href=\"../view/usuario.jsp\" data-toggle=\"collapse\" data-target=\"#edit\">\n");
      out.write("   <i class=\"fa fa-edit\"></i> Gestion usuarios \n");
      out.write("   </a>\n");
      out.write("</li>\n");
      out.write("    \n");
      out.write("    <li class=\"panel\">\n");
      out.write("   <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#inbox\">\n");
      out.write("   <i class=\"fa fa-inbox\"></i> Pedidos pendientes \n");
      out.write("   </a>\n");
      out.write("</li>\n");
      out.write("    \n");
      out.write("    <li class=\"panel\">\n");
      out.write("   <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#cogs\">\n");
      out.write("   <i class=\"fa fa-cogs\"></i> Configuracion <i class=\"fa fa-caret-down pull-right\"></i>\n");
      out.write("   </a>\n");
      out.write("    \n");
      out.write("  <ul class=\"collapse nav\" id=\"cogs\">\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Modificar nombre usuario</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Contraseña</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</li>\n");
      out.write("    \n");
      out.write("    <li class=\"panel\">\n");
      out.write("        <a href=\"../login.jsp\" data-toggle=\"collapse\" data-target=\"#paper\">\n");
      out.write("        <i class=\"fa fa-sign-out\"></i>  Cerrar session\n");
      out.write("        </a>\n");
      out.write("    </li>                \n");
      out.write("</ul>      \n");
      out.write("    </div>");
      out.write("\n");
      out.write("  <div class=\"container-2\">\n");
      out.write("  <div id=\"page-wrapper\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("     <div class=\"col-md-12\">\n");
      out.write("      <div class=\"page-title\">\n");
      out.write("       <h2>Gestion Usuarios</h2>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("         <li class=\"active\"><i class=\"fa fa-user\"></i> Usuarios</li>\n");
      out.write("        </ol>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("      <button id=\"OpenModal\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#ModalUser\"><i class=\"fa fa-user-plus\"></i> Agregar Usuario</button>\n");
      out.write("<!-- Modal Usuario-->\n");
      out.write("<div class=\"modal fade\" id=\"ModalUser\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputEmail1\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nombresUser\" placeholder=\"Nombre\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"apellidosUser\" placeholder=\"Apellidos\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">DNI</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"DNIUser\" placeholder=\"ex. 78628612\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Direccion</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"direccionUser\" placeholder=\"ex. La alameda, Mz.I Lt.1 - Ñaña\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"sel1\">Rol</label>\n");
      out.write("                      <select class=\"form-control\" id=\"rolUser\">\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        \n");
      out.write("                      </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Usuario</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"UsuarioUser\" placeholder=\"ex.CarlosLoayza123\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"emailUser\" aria-describedby=\"emailHelp\" placeholder=\"Email\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"passUser\" placeholder=\"Contraseña\">\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                <button type=\"button\" id=\"AddUser\" class=\"btn btn-primary\">Agregar</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Modal Editar-Usuario-->\n");
      out.write("<div class=\"modal fade\" id=\"ModalEditUser\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputEmail1\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"edit_nombresUser\" placeholder=\"Nombre\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"edit_apellidosUser\" placeholder=\"Apellidos\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">DNI</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"edit_DNIUser\" placeholder=\"ex. 78628612\" disabled>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Direccion</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"edit_direccionUser\" placeholder=\"ex. La alameda, Mz.I Lt.1 - Ñaña\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"sel1\">Rol</label>\n");
      out.write("                      <select class=\"form-control\" id=\"edit_rolUser\" disabled>\n");
      out.write("                        <option>Administrador</option>\n");
      out.write("                        <option>Vendendor</option>\n");
      out.write("                        \n");
      out.write("                      </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Usuario</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"edit_UsuarioUser\" placeholder=\"ex.CarlosLoayza123\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"edit_emailUser\" aria-describedby=\"emailHelp\" placeholder=\"Email\">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputPassword1\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"edit_passUser\" placeholder=\"Contraseña\">\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                <button type=\"button\" id=\"edit_User\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div></div>\n");
      out.write("<table  id=\"table\" class=\"table table-hover\">\n");
      out.write("       <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>#</th>\n");
      out.write("            <th>Nombres</th>\n");
      out.write("            <th>Apellidos</th>\n");
      out.write("            <th>DNI</th>\n");
      out.write("            <th>Direccion</th>\n");
      out.write("            <th>Usuario</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contraseña</th>\n");
      out.write("            <th>Rol</th>    \n");
      out.write("            <th>Accion</th>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        \n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>  \n");
      out.write("   ");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"pull-left\"> Copyright © Plateria Guadalupe 2018. All right reserved. </p>\n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("                <ul class=\"nav nav-pills payments\">\n");
      out.write("                \t<li><i class=\"fa fa-cc-visa\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-mastercard\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-amex\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-paypal\"></i></li>\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/.footer-bottom--> \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("   ");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>   \n");
      out.write("    <script src=\"../js/bootstrap.js\"></script>\n");
      out.write("    <script src=\"../js/scriptMain.js\"></script>\n");
      out.write("\n");
      out.write("   <script src=\"../js/persona.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    @media screen and (max-width: 950px) {\n");
      out.write("       table {\n");
      out.write("           width:100%;\n");
      out.write("       }\n");
      out.write("       thead {\n");
      out.write("           display: none;\n");
      out.write("       }\n");
      out.write("       tr:nth-of-type(2n) {\n");
      out.write("           background-color: inherit;\n");
      out.write("       }\n");
      out.write("       tr td:first-child {\n");
      out.write("           background: #f0f0f0;\n");
      out.write("           font-weight:bold;\n");
      out.write("           font-size:1.3em;\n");
      out.write("       }\n");
      out.write("       tbody td {\n");
      out.write("           display: block;\n");
      out.write("           text-align:center;\n");
      out.write("       }\n");
      out.write("       tbody td:before {\n");
      out.write("           content: attr(data-th);\n");
      out.write("           display: block;\n");
      out.write("           text-align:center;\n");
      out.write("       }\n");
      out.write("}\n");
      out.write("</style>\n");
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
}
