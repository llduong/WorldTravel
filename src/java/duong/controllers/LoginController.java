/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationErrorUser;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class LoginController extends HttpServlet {

    private static final String CUSTOMER = "index.jsp";
    private static final String ADMIN = "admin.jsp";
    private static final String ERROR = "index.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        RegistrationErrorUser errobObj = new RegistrationErrorUser();
        boolean valid = true;
        try {
            HttpSession session = request.getSession();
            String username = (String) request.getAttribute("USER");
            String password = (String) request.getAttribute("PASS");
            if (username == null || password == null) {
                username = request.getParameter("txtUsername");
                if (username.length() == 0) {
                    errobObj.setUsernameError("Username can't be blank");
                    valid = false;
                }
                password = request.getParameter("txtPassword");
                if (password.length() == 0) {
                    errobObj.setPasswordError("Password can't be blank");
                    valid = false;
                }
                if (valid) {
                    RegistrationDAO dao = new RegistrationDAO();

                    String role = dao.checkLogin(username, password);

                    if (role.equals("customer")) {
                        url = CUSTOMER;
                        session.setAttribute("USER", username);
                    } else if (role.equals("admin")) {
                        url = ADMIN;
                        session.setAttribute("ADMIN", username);
                    } else {
                        request.setAttribute("ERROR", "Invalid username or password");
                    }
                } else {
                    request.setAttribute("INVALID", errobObj);
                }
            } else {
                RegistrationDAO dao = new RegistrationDAO();

                String role = dao.checkLogin(username, password);

                if (role.equals("customer")) {
                    url = CUSTOMER;
                    session.setAttribute("USER", username);
                } else if (role.equals("admin")) {
                    url = ADMIN;
                    session.setAttribute("ADMIN", username);
                } else {
                    request.setAttribute("ERROR", "Invalid username or password");
                }
            }
        } catch (Exception e) {
            log("ERROR at Login Controller: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
