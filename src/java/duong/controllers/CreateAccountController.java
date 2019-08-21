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

/**
 *
 * @author hp
 */
public class CreateAccountController extends HttpServlet {

    private static final String ERROR = "create-account.jsp";
    private static final String CUSTOMER = "LoginController";
    private static final String FAIL = "index.jsp";

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
        boolean valid = true, sex = false;
        try {
            RegistrationErrorUser errorObj = new RegistrationErrorUser();
            RegistrationDAO dao = new RegistrationDAO();
            String username = request.getParameter("txtUsername");
            if (username.length() == 0) {
                errorObj.setUsernameError("Username can't be blank");
                valid = false;
            } else {
                if (!dao.checkDuplicateUsername(username)) {
                    errorObj.setUsernameError("Username is existed");
                    valid = false;
                }
            }
            String password = request.getParameter("txtPassword");
            if (password.length() == 0) {
                errorObj.setPasswordError("Password can't be blank");
                valid = false;
            }
            String confirm = request.getParameter("txtConfirm");
            if (confirm.length() == 0) {
                errorObj.setConfirmpasswordError("Confirm password can't be blank");
            } else {
                if (!confirm.equals(password)) {
                    errorObj.setConfirmpasswordError("Confirm password isn't match password");
                    valid = false;
                }
            }
            String fullname = request.getParameter("txtFullname");
            if (fullname.length() == 0) {
                errorObj.setFullnameError("Fullname can't be blank");
                valid = false;
            }
            String gender = request.getParameter("gender");
            if (gender == null) {
                errorObj.setGenderError("You must chooser your gender");
                valid = false;
            } else {
                sex = gender.equals("Male");
            }
            String address = request.getParameter("txtAddress");
            if (address.length() == 0) {
                errorObj.setAddressError("Address can't be blank");
                valid = false;
            }
            String phone = request.getParameter("txtPhone");
            if (phone.length() == 0) {
                errorObj.setPhoneError("Phone can't be blank");
                valid = false;
            } else {
                if (!phone.matches("\\d{10}")) {
                    errorObj.setPhoneError("Phone must be 10 digits");
                    valid = false;
                }
            }
            if (valid) {
                boolean result = false;
                RegistrationDTCustomer cus = new RegistrationDTCustomer(username, fullname, sex, address, phone);

                cus.setPassword(password);
                result = dao.createAccount(cus);
                if (result) {
                    url = CUSTOMER;
                    request.setAttribute("NAME", username);
                    request.setAttribute("PASS", password);
                } else {
                    url = FAIL;
                    request.setAttribute("ERROR", "Register fail");
                }
            } else {
                request.setAttribute("INVALID", errorObj);
            }
        } catch (Exception e) {
            if (e.getMessage().contains("duplicate")) {
                RegistrationErrorUser errorObj = new RegistrationErrorUser();
                errorObj.setUsernameError("Username is existed");
                request.setAttribute("INVALID", errorObj);
                url = ERROR;
            }
            log("ERROR at Create account controller: " + e.getMessage());
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
