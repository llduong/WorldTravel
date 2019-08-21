/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationDTTour;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class UpdateBookedTourController extends HttpServlet {
    
    private static final String ERROR = "edit-tour-booked.jsp";
    private static final String SUCCESS = "SearchTourController";

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
        try {
            String txtTourID = request.getParameter("txtTourID");
            String status = request.getParameter("status");
            String txtTicket = request.getParameter("Ticket");
            String date = request.getParameter("date");
            String txtTName = request.getParameter("txtTName");
            boolean valid = true;
            int ticket = 0;
            if (txtTicket.length() == 0) {
                valid = false;
                request.setAttribute("INVALID", "Ticket can't be blank");
            } else {
                if (!txtTicket.matches("\\d+")) {
                    valid = false;
                    request.setAttribute("INVALID", "Ticket must be a digits and can't be a negative number");
                } else {
                    ticket = Integer.parseInt(txtTicket);
                }
            }
            boolean isStatus;
            if (ticket == 0) {
                isStatus = false;
            } else {
                if (status != null) {
                    isStatus = true;
                } else {
                    isStatus = false;
                }
            }
            if (valid) {
                RegistrationDAO dao = new RegistrationDAO();
                boolean result = dao.updateTourStatus(txtTourID, isStatus, ticket);
                if (result) {
                    request.setAttribute("MESSAGE", "Update tour status succeed");
                } else {
                    request.setAttribute("MESSAGE", "Update tour status fail");
                }
                url = SUCCESS;
            } else {
                RegistrationDTTour tour = new RegistrationDTTour();
                tour.setID(txtTourID);
                tour.setTicket(ticket);
                tour.setStatus(isStatus);
                request.setAttribute("INFO", tour);
                request.setAttribute("txtTName", txtTName);
                request.setAttribute("date", date);
            }
        } catch (Exception e) {
            log("ERROR at Update Booked Tour Controller: " + e.getMessage());
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
