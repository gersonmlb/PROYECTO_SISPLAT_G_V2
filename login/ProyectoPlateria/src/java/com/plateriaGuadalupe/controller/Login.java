/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plateriaGuadalupe.controller;

import com.google.gson.Gson;
import com.plateriaGuadalupe.dao.UserDao;
import com.plateriaGuadalupe.daoimp.UserDaoImp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    private UserDao ud = new UserDaoImp();
    private Gson g = new Gson();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             int op = Integer.parseInt(request.getParameter("opc"));
             HttpSession sesion = request.getSession();
             RequestDispatcher rd;
             HashMap<String, Object> datos = new HashMap<>();
             switch(op){
                 case 1:
                     datos = ud.validar(request.getParameter("user"), request.getParameter("pass"), request.getParameter("sede"));
                        if(datos.size()>0){
                        sesion.setAttribute("nombre", datos.get("nom"));
                        sesion.setAttribute("apellidos", datos.get("ape"));
                        String nombres = datos.get("nom")+" "+datos.get("ape");
                        sesion.setAttribute("nombresCom", nombres);
                        sesion.setAttribute("rol", datos.get("rol"));
                        sesion.setAttribute("user", datos.get("user"));
                        sesion.setAttribute("sede", request.getParameter("sede"));
                        System.out.println(datos);
                    }
                 break; 
                 case 2: out.println(g.toJson(ud.Remember(request.getParameter("email"))));
                 break;
                 case 3:
                     if(request.getParameter("btnIniciar")!=null){
                     String user = request.getParameter("user");
                     String pass = request.getParameter("pass");
                     String sede = request.getParameter("sedet");
                     
                     int rol = ud.validar2(user, pass, sede).getRol();
                     
                     request.setAttribute("nombre", ud.validar2(user, pass, sede).getNombre());
                     request.setAttribute("apellidos", ud.validar2(user, pass, sede).getApellido());
                     String nombres = ud.validar2(user, pass, sede).getNombre()+" "+ud.validar2(user, pass, sede).getApellido();
                     request.setAttribute("nombresCom", nombres);
                     request.setAttribute("user", ud.validar2(user, pass, sede).getUser());
                     request.setAttribute("rol", rol);
                     rd=request.getRequestDispatcher("login.jsp");
                     rd.forward(request, response);
            
                     }  
                     
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

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
