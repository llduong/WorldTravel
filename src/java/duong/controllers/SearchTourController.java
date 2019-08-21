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
import sun.reflect.generics.visitor.Reifier;

/**
 *
 * @author hp
 */
public class SearchTourController extends HttpServlet {

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
            String tourname, date;
            String txtTName = (String) request.getSession().getAttribute("txtTName");
            String txtDate = (String) request.getSession().getAttribute("date");
            int totalTicket = 0;
            if (txtTName != null && txtDate != null) {
                tourname = txtTName;
                date = txtDate;
            } else if (txtDate != null && txtTName == null) {
                tourname = txtTName;
                date = txtDate;
            } else if (txtTName != null && txtDate == null) {
                tourname = txtTName;
                date = txtDate;
            } else {
                tourname = request.getParameter("txtTName");
                date = request.getParameter("date");
            }

            RegistrationDAO dao = new RegistrationDAO();
            List<RegistrationDTTour> result;
            if (tourname.isEmpty() && !date.isEmpty()) {
                result = dao.searchByDate(date);
            } else if (!tourname.isEmpty() && !date.isEmpty()) {
                result = dao.searchByTourNameAndDate(tourname, date);
            } else {
                result = dao.searchByTourName(tourname);
            }
            List<RegistrationDTTicket> ticketList = new ArrayList<>();
            RegistrationDTTicket ticket = new RegistrationDTTicket();
            for (RegistrationDTTour x : result) {
                totalTicket = dao.getTotalTicket(x.getID());
                if(totalTicket > 0){
                    ticket = new RegistrationDTTicket();
                    ticket.setTotalTicket(totalTicket);
                    ticket.setTourID(x.getID());
                    ticketList.add(ticket);
                }
            }
            HttpSession session = request.getSession();
            session.setAttribute("txtTName", txtTName);
            session.setAttribute("date", txtDate);
            request.setAttribute("INFO", result);
            request.setAttribute("TICKET", ticketList);
        } catch (Exception e) {
            log("ERROR at Search Tour Controller: " + e.getMessage());
        } finally {
            request.getRequestDispatcher("view-tour.jsp").forward(request, response);
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
