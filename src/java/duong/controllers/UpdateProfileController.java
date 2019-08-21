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
public class UpdateProfileController extends HttpServlet {

    private static final String FAIL = "profile.jsp";
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
        String url = FAIL;
        boolean valid = true;
        boolean sex = false;
        try {
            RegistrationErrorUser errorObj = new RegistrationErrorUser();
            String username = request.getParameter("txtUsername");
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
            RegistrationDTCustomer cus = new RegistrationDTCustomer(username, fullname, sex, address, phone);
            if (valid) {
                RegistrationDAO dao = new RegistrationDAO();

                boolean result = dao.updateProfile(cus);

                if (result) {
                    url = SUCCEED;
                    request.setAttribute("MESSAGE", "Update profile successful");
                }
            } else {
                request.setAttribute("INVALID", errorObj);
                request.setAttribute("INFO", cus);
            }
        } catch (Exception e) {
            log("ERROR at Update Profile Controller : " + e.getMessage());
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
