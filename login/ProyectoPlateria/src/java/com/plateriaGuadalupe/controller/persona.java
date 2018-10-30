/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plateriaGuadalupe.controller;

import com.google.gson.Gson;
import com.plateriaGuadalupe.dao.ClienteEmpresarialDao;
import com.plateriaGuadalupe.dao.ClienteNaturalDao;
import com.plateriaGuadalupe.dao.PersonaDao;
import com.plateriaGuadalupe.dao.UserDao;
import com.plateriaGuadalupe.daoimp.ClienteEmpresarialDaoImp;
import com.plateriaGuadalupe.daoimp.ClienteNaturalDaoImp;
import com.plateriaGuadalupe.daoimp.PersonaDaoImp;
import com.plateriaGuadalupe.daoimp.UserDaoImp;
import com.plateriaGuadalupe.entity.ClienteEmpresarial;
import com.plateriaGuadalupe.entity.ClienteNatural;
import com.plateriaGuadalupe.entity.User;
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
@WebServlet(name = "persona", urlPatterns = {"/persona"})
public class persona extends HttpServlet {

    private PersonaDao pe = new PersonaDaoImp();
    private ClienteNaturalDao cn = new ClienteNaturalDaoImp();
    private ClienteEmpresarialDao ce = new ClienteEmpresarialDaoImp();
    private UserDao us = new UserDaoImp();
    private Gson g = new Gson();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int op = Integer.parseInt(request.getParameter("opc"));
            switch(op){
                case 1:
                    ClienteNatural CNa= new ClienteNatural(request.getParameter("nombres"),
                                           request.getParameter("apellidos"),
                                           request.getParameter("dni"));
                                            cn.create(CNa);
                break;
               //Usuarios
                case 2: out.println(g.toJson(us.read(Integer.parseInt(request.getParameter("DNI")))));
                break;
                case 3:
                    User u= new User(request.getParameter("nombres"),
                                           request.getParameter("apellidos"),
                                           request.getParameter("dni"),
                                           request.getParameter("user"),
                                           request.getParameter("contra"),
                                           Integer.parseInt(request.getParameter("rol")),
                                           request.getParameter("direccion"),
                                           request.getParameter("email"));
                                           us.create(u);   
                break;
                case 5: User use = new User(request.getParameter("nom"),
                                           request.getParameter("ape"),
                                           request.getParameter("dni"),
                                           request.getParameter("use"),
                                           request.getParameter("pass"),
                                           request.getParameter("dire"),
                                           request.getParameter("ema"));
                     us.update(use);
                break;
                case 6:
                     us.delete(request.getParameter("dni"));
                     break;
                case 4:
                    out.println(g.toJson(us.ReadAll()));
                break; 
                case 8:
                    out.print(g.toJson(us.NroUser()));
                break;
                //Cliente Empresarial
                case 7:
                    ClienteEmpresarial cem= new ClienteEmpresarial(request.getParameter("razonso"),
                                                                   Integer.parseInt(request.getParameter("ruc")),
                                                                   request.getParameter("direccion"),
                                                                   Integer.parseInt("telefono"));
                                                                   ce.create(cem);
                break;
                //buscar DNI o ruc
                case 9:
                    out.println(g.toJson(pe.names(Integer.parseInt(request.getParameter("DR")))));
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
