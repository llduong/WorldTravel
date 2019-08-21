/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationDTTicket;
import duong.dtos.RegistrationDTTour;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class MyCartController extends HttpServlet {

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
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute("USER") != null) {
                String username = (String) session.getAttribute("USER");
                RegistrationDAO dao = new RegistrationDAO();
                if (session.getAttribute("TICKET") != null) {
                    List<RegistrationDTTicket> result = new ArrayList<>();
                    List<RegistrationDTTicket> tickets = (ArrayList<RegistrationDTTicket>) session.getAttribute("TICKET");
                    RegistrationDTTicket ticket = new RegistrationDTTicket();
                    for (RegistrationDTTicket x : tickets) {
                        ticket = dao.showRecentTicket(username, x.getID());
                        ticket.setTourname(dao.findByPrimaryKey(x.getTourID()).getName());
                        result.add(ticket);
                    }
                    request.setAttribute("INFO", result);
                } else {
                    request.setAttribute("MESSAGE", "You didn't buy any tour yet");
                }
            }
        } catch (Exception e) {
            log("ERROR at My Cart Controller: " + e.getMessage());
        } finally {
            request.getRequestDispatcher("my-cart.jsp").forward(request, response);
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
