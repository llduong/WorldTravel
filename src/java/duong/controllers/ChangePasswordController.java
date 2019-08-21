/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationDTCustomer;
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
public class ChangePasswordController extends HttpServlet {

    private static final String ERROR = "change-password.jsp";
    private static final String SUCCEED = "index.jsp";

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
        boolean valid = true;
        try {
            RegistrationErrorUser errorObj = new RegistrationErrorUser();
            RegistrationDAO dao = new RegistrationDAO();
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("USER");

            RegistrationDTCustomer cus = dao.findByUsername(username);

            String password = request.getParameter("txtPassword");
            if (password.isEmpty()) {
                errorObj.setPasswordError("Old password can't be blank");
                valid = false;
            } else {
                if (!cus.getPassword().equals(password)) {
                    errorObj.setPasswordError("Old password doesn't match");
                    valid = false;
                }
            }
            String newpassword = request.getParameter("txtNewPassword");
            if (newpassword.isEmpty()) {
                errorObj.setNewpasswordError("New password can't be blank");
                valid = false;
            }
            String confirmnewpassword = request.getParameter("txtConfirmNewPassword");
            if (confirmnewpassword.isEmpty()) {
                errorObj.setConfirmpasswordError("Confirm password can't be blank");
                valid = false;
            } else {
                if (!confirmnewpassword.equals(newpassword)) {
                    errorObj.setConfirmpasswordError("Confirm password doesn't match");
                    valid = false;
                }
            }
            if (valid) {
                cus.setPassword(newpassword);
                dao.changePassword(cus);
                url = SUCCEED;
            } else {
                request.setAttribute("INVALID", errorObj);
            }
        } catch (Exception e) {
            log("ERROR at Change Password Controller: " + e.getMessage());
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
