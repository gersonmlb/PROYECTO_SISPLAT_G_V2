/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plateriaGuadalupe.controller;

import com.google.gson.Gson;
import com.plateriaGuadalupe.dao.ProductoDao;
import com.plateriaGuadalupe.dao.UserDao;
import com.plateriaGuadalupe.daoimp.ProductoDaoImp;
import com.plateriaGuadalupe.daoimp.UserDaoImp;
import com.plateriaGuadalupe.entity.Producto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CRIRI
 */
@WebServlet(name = "agregar", urlPatterns = {"/agregar"})
public class agregar extends HttpServlet {

   private ProductoDao pr = new ProductoDaoImp();
   private Gson g = new Gson();
   private UserDao ud = new UserDaoImp();
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int op = Integer.parseInt(request.getParameter("opc"));
            HttpSession sesion = request.getSession();
            HashMap<String, Object> datos = new HashMap<>();
            switch(op){
                
                case 1:
                    Producto p =new Producto(request.getParameter("nombre"),
                                     Double.parseDouble(request.getParameter("precio")),
                                     Integer.parseInt(request.getParameter("stock")),
                                     Integer.parseInt(request.getParameter("tipo")));
                                     pr.create(p); 
                                     
                    break;
                 case 2:
                     out.println(g.toJson(pr.ReadAll()));
                    break;   
                    
                 case 3:
                     pr.delete(Integer.parseInt(request.getParameter("id")));
                     break;
                 case 4: out.println(g.toJson(pr.read(Integer.parseInt(request.getParameter("id")))));
                    break;
                 case 5: Producto pp = new Producto(request.getParameter("codigo"),
                         request.getParameter("nombre"),Double.parseDouble(request.getParameter("precio")),Integer.parseInt(request.getParameter("stock")),
                         Integer.parseInt(request.getParameter("tipo")));
                     pr.update(pp);
                     break;
                 case 6:
                     out.println(g.toJson(pr.NroProd()));
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
