package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/template/headerLogin.jspf");
    _jspx_dependants.add("/WEB-INF/template/loginMainBody.jspf");
    _jspx_dependants.add("/WEB-INF/template/footer.jspf");
    _jspx_dependants.add("/WEB-INF/template/footerLogin.jspf");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>  \n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("     ");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/styleLogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/styleFooter.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\n");
      out.write("     <title>Login</title>\n");
      out.write("     <link rel=\"shortcut icon\" href=\"img/logoTitle.ico\">\n");
      out.write("</head>\n");
      out.write("<body>        \n");
      out.write("      ");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("   <section id=\"formHolder\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("         <!-- Logo  -->\n");
      out.write("         <div class=\"col-sm-6 brand\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <img src=\"img/logoLogin.png\">\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div class=\"col-sm-6 form\">\n");
      out.write("\n");
      out.write("            <!-- Recuperacion -->\n");
      out.write("            <div class=\"login form-peice switched\">\n");
      out.write("               <form class=\"login-form\" action=\"#\" method=\"post\">\n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                       <p>\n");
      out.write("                           Te envieremos un email de recuperacion de contraseña.\n");
      out.write("                       </p>\n");
      out.write("                   </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                     <label for=\"name\">Ingresar e-mail</label>\n");
      out.write("                     <input type=\"email\" class=\"email\" name=\"loginemail\" id=\"emailR\">\n");
      out.write("                     <span class=\"error\"></span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"CTA\">\n");
      out.write("                     <input type=\"submit\" value=\"Enviar\" id=\"remember\">\n");
      out.write("                     <a href=\"#\" class=\"switch\">VOLVER A LOGIN</a>\n");
      out.write("                  </div>\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Login -->\n");
      out.write("            <div class=\"signup form-peice\">         \n");
      out.write("               <form class=\"signup-form\" action=\"\" method=\"POST\">\n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                     <label for=\"loginemail\">Usuario</label>\n");
      out.write("                     <input type=\"text\" class=\"name\" name=\"usuario\" id=\"usuario\" required>\n");
      out.write("                     <input type=\"hidden\" value=\"1\" name=\"opc\">\n");
      out.write("                      <span class=\"error\"></span>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                     <label for=\"loginPassword\">Contraseña</label>\n");
      out.write("                     <input type=\"password\" class=\"pass\" name=\"password\" id=\"password\" required>\n");
      out.write("                     <span class=\"error\"></span>\n");
      out.write("                  </div>\n");
      out.write("                   \n");
      out.write("                   <div class=\"alert alert-danger\" style=\"margin-top: 100px; display: none;\">\n");
      out.write("                    <strong>Atencion!</strong> Datos incorectos</div>\n");
      out.write("                              \n");
      out.write("                  <div class=\"dropdown\">   \n");
      out.write("                       <select class=\"select\" name=\"sedet\" id=\"sedet\">\n");
      out.write("\t\t            <option> Seleccione la sede: </option>\n");
      out.write("                            <option>Tienda1</option>\n");
      out.write("\t\t            <option>Tienda2</option>\n");
      out.write("\t\t        </select>\t    \n");
      out.write("                  </div>  \n");
      out.write("                   \n");
      out.write("                  <div class=\"CTA\">\n");
      out.write("                      <input type=\"submit\" value=\"Ingresar\" name=\"btnIniciar\" id=\"Login\">\n");
      out.write("                     <a href=\"#\" class=\"switch\">Olvidaste tu contraseña?</a>\n");
      out.write("                  </div>\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("            ");

                HttpSession sesion = request.getSession();
                int rol=0;
                if(request.getAttribute("rol")!=null){
                    rol = (Integer)request.getAttribute("rol");
                    if(rol==1){
                        sesion.setAttribute("rol", rol);
                        sesion.setAttribute("nombre", request.getAttribute("nombre"));
                        sesion.setAttribute("apellidos", request.getAttribute("apellidos"));
                        sesion.setAttribute("nombresCom", request.getAttribute("nombresCom"));
                        sesion.setAttribute("user", request.getAttribute("user"));
                        response.sendRedirect("main.jsp");
                    }
                }
                
                
                
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      ");
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
      out.write("  \n");
      out.write("      ");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/scriptLogin.js\"></script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
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
