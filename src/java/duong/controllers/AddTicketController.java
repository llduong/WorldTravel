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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class AddTicketController extends HttpServlet {


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
        String url = "";
        try {
            RegistrationDAO dao = new RegistrationDAO();
            HttpSession session = request.getSession();            
            String ID = request.getParameter("txtTourID");
            int adult = Integer.parseInt(request.getParameter("adultTicket"));
            int children = Integer.parseInt(request.getParameter("childrenTicket"));
            RegistrationDTTour tour = dao.findByPrimaryKey(ID);

            int size = dao.countTicket();

            RegistrationDTTicket ticket = new RegistrationDTTicket("TCK" + size, ID, (String) session.getAttribute("USER"), adult, children,
                    (tour.getPrice() * adult) + (tour.getPrice() / 2 * children));
            request.setAttribute("adultTicket", adult);
            request.setAttribute("childrenTicket", children);
            session.setAttribute("TCK", ticket);
//            }
        } catch (Exception e) {
            log("ERROR at Add Ticket Controller: " + e.getMessage());
        } finally {
            request.getRequestDispatcher("customer-info.jsp").forward(request, response);
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
