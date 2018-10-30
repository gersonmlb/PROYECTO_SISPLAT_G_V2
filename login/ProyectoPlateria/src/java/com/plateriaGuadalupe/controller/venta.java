
package com.plateriaGuadalupe.controller;

import com.google.gson.Gson;
import com.plateriaGuadalupe.dao.PagosDao;
import com.plateriaGuadalupe.dao.ProductoDao;
import com.plateriaGuadalupe.dao.VentaDao;
import com.plateriaGuadalupe.dao.detalleVentaDao;
import com.plateriaGuadalupe.daoimp.PagosDaoImp;
import com.plateriaGuadalupe.daoimp.ProductoDaoImp;
import com.plateriaGuadalupe.daoimp.VentaDaoImp;
import com.plateriaGuadalupe.daoimp.detalleVentaDaoImp;
import com.plateriaGuadalupe.entity.Pagos;
import com.plateriaGuadalupe.entity.Producto;
import com.plateriaGuadalupe.entity.Venta;
import com.plateriaGuadalupe.entity.detalleVenta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CRIRI
 */
@WebServlet(name = "venta", urlPatterns = {"/venta"})
public class venta extends HttpServlet {
    private VentaDao ve = new VentaDaoImp();
    private detalleVentaDao detv = new detalleVentaDaoImp();
    private PagosDao p = new PagosDaoImp();
     private Gson g = new Gson();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int op = Integer.parseInt(request.getParameter("opc"));
            switch(op){
                case 1:
                    Venta v= new Venta(request.getParameter("cliente"),
                                           request.getParameter("documento"),
                                           request.getParameter("usuario"),
                                           request.getParameter("sede"),
                                           request.getParameter("total"));
                                            ve.create(v);
                break;  
                case 2:
                     out.println(g.toJson(ve.buscarProductoCodigo(request.getParameter("cod"))));                   
                    break;
                case 3:
                    detalleVenta dv= new detalleVenta(Double.parseDouble(request.getParameter("precio")),
                                           Integer.parseInt(request.getParameter("cant")),
                                           request.getParameter("prod"));
                                            detv.create(dv);
                break;
                case 4:
                    Pagos pag= new Pagos(Double.parseDouble(request.getParameter("imp")),
                                           request.getParameter("tip"),
                                           request.getParameter("sed"));
                                            p.create(pag);
                break;
                case 5:
                    out.println(g.toJson(ve.NroVenta()));
                break;
                
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
