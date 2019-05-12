package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utilerias.Conversiones;
import java.util.Date;

public final class reporteExcel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/vnd.ms-excel");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/WEB-INF/manejoErrores.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

  String nombreArchivo="reporte.xls";
  response.setHeader("Content-Disposition", "inline; filename=" + nombreArchivo );

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reporte de Excel</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Reporte de Excel</h1>\n");
      out.write("        <br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("          <tr>\n");
      out.write("            <th>Curso</th>\n");
      out.write("            <th>Descripción</th>\n");
      out.write("            <th>Fecha Inicio</th>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>1. Fudamentos de Java</td>\n");
      out.write("            <td>Aprenderemos la sintaxis básica de Java</td>\n");
      out.write("            <td>");
      out.print( Conversiones.formato( "05 05 1990" ) );
      out.write("</td> <!-- Aqui ocurre el error que atrapara la excepcion -->\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>2. Programación con Java</td>\n");
      out.write("            <td>Pondremos en práctica conceptos de la Programación Orientada a Objetos</td>\n");
      out.write("            <td>");
      out.print( Conversiones.formato( new Date() ) );
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
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
