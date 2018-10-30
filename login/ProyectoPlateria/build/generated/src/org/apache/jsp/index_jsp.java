package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <title>Joyeria</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor-header\">\n");
      out.write("            <header>\n");
      out.write("        <span id=\"btn-menu\" class=\"fa fa-bars \"></span>\n");
      out.write("        <span id=\"btn-salir\" class=\"fa fa-sign-out btn-salir\"></span>\n");
      out.write("        <nav class=\"navegacion\">\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li class=\"cerrarMenu\"><span id=\"btn-cerrarMenu\" class=\"fa fa-close \" ></span></li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"user-menu\">\n");
      out.write("                        <img src=\"img/img.jpg\" alt=\"\" style=\"width: 100px;height: 100px;border-radius: 150px;\"></a>\n");
      out.write("                        <div style=\"float: right;width: 65%;text-align: center\">\n");
      out.write("                            <label style=\"color: white\">Christan Daniel Rios Ravelo</label><br>\n");
      out.write("                            <label style=\"color: white;text-align: left;\"><i class=\"fa fa-circle\" aria-hidden=\"true\" style=\"color: green; margin-right: 5px;\"></i>Online</label><br><br>\n");
      out.write("                            <label style=\"color: white; font-size: 13px;\">Administrador</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"titolo-menu\">MENU</li>\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-home icon-menu\"></span>Home</a></li>\n");
      out.write("                <li class=\"item-submenu\" menu=\"1\">\n");
      out.write("                    <a href=\"#\"><span class=\"fa fa-shopping-cart icon-menu\"></span>Ventas</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li class=\"titolo-subVentas\">Ventas</li>\n");
      out.write("                        <li class=\"atras-ventas\">Atras</li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-users icon-menu\"></span>No se que escribir</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-truck icon-menu\"></span>No se que escribirx2</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-line-chart icon-menu\"></span>No se que escribirx3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-users icon-menu\"></span>Clientes</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-truck icon-menu\"></span>Control de stock</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-line-chart icon-menu\"></span>Reportes</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contenedor-main\">\n");
      out.write("            <main>\n");
      out.write("                <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("                    <div class=\"datos-\" >\n");
      out.write("                        <label class=\"dim-nun\">5</label>\n");
      out.write("                        <label>Ventas de hoy</label>\n");
      out.write("                    </div>\n");
      out.write("                    <i class=\"fa fa-shopping-cart img-card\" style=\"color: lightskyblue;width: 100%;height: 40%;\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightskyblue\">\n");
      out.write("                    <span class=\"bot-card\">VENTA</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightseagreen\">\n");
      out.write("                    <span class=\"bot-card\">Venta</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightgoldenrodyellow\">\n");
      out.write("                    <span class=\"bot-card\">Venta</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightpink\">\n");
      out.write("                    <span class=\"bot-card\">Venta</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightgreen\">\n");
      out.write("                    <span class=\"bot-card\">Venta</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"style-card\">\n");
      out.write("                <div class=\"contenedor-card\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ir\" style=\"background: lightsalmon\">\n");
      out.write("                    <span class=\"bot-card\">Venta</span>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("        </main>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/script.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
