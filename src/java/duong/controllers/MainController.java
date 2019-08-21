/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class MainController extends HttpServlet {

    private static final String ERROR = "index.jsp";
    private static final String LOGIN = "LoginController";
    private static final String CREATE = "CreateAccountController";
    private static final String CHANGE_PASSWORD = "ChangePasswordController";
    private static final String INSERT = "AddTourController";
    private static final String EDIT_PROFILE = "EditProfileController";
    private static final String UPDATE_PROFILE = "UpdateProfileController";
    private static final String FIND_TOUR = "FindTourController";
    private static final String LOGOUT = "LogOutController";
    private static final String SEARCH_TOUR = "SearchTourController";
    private static final String DELETE = "DeleteTourController";
    private static final String EDIT_TOUR = "EditTourController";
    private static final String UPDATE_TOUR = "UpdateTourController";
    private static final String ADD_CART = "AddTicketController";
    private static final String ADD_TICKET = "ConfirmTicketController";
    private static final String CONFIRM_TICKET = "ConfirmTicketController";
    private static final String UPDATE_BOOKED_TOUR = "UpdateBookedTourController";
    private static final String SHOW_HISTORY = "ShowHistoryController";
    private static final String MY_CART = "MyCartController";

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
        String action = request.getParameter("action");
        try {
            if (action.equals("Create")) {
                url = CREATE;
            } else if (action.equals("Login")) {
                url = LOGIN;
            } else if (action.equals("Add Tour")) {
                url = INSERT;
            } else if (action.equals("Edit Profile")) {
                url = EDIT_PROFILE;
            } else if (action.equals("Change Password")) {
                url = CHANGE_PASSWORD;
            } else if (action.equals("Update Profile")) {
                url = UPDATE_PROFILE;
            } else if (action.equals("Find")) {
                url = FIND_TOUR;
            } else if (action.equals("Log out")) {
                url = LOGOUT;
            } else if (action.equals("Search")) {
                url = SEARCH_TOUR;
            } else if (action.equals("Delete")) {
                url = DELETE;
            } else if (action.equals("Edit")) {
                url = EDIT_TOUR;
            } else if (action.equals("Update Tour")) {
                url = UPDATE_TOUR;
            } else if (action.equals("Update Tour Booked")) {
                url = UPDATE_BOOKED_TOUR;
            } else if (action.equals("Add To Cart")) {
                url = ADD_CART;
            } else if (action.equals("Add Ticket")) {
                url = ADD_TICKET;
            } else if (action.equals("Confirm Ticket")) {
                url = CONFIRM_TICKET;
            } else if (action.equals("Show History")) {
                url = SHOW_HISTORY;
            } else if (action.equals("My Cart")) {
                url = MY_CART;
            } else if (action.equals("View all tour")) {
                url = "view-tour.jsp";
            } else if (action.equals("Add new tour")) {
                url = "insert.jsp";
            }
        } catch (Exception e) {
            log("ERROR at the main controller: " + e.getMessage());
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
