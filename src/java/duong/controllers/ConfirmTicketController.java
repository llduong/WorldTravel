/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationDTAdult;
import duong.dtos.RegistrationDTChildren;
import duong.dtos.RegistrationDTTicket;
import duong.dtos.RegistrationErrorAdultInfo;
import duong.dtos.RegistrationErrorChildrenInfo;
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
public class ConfirmTicketController extends HttpServlet {

    private static final String ERROR = "customer-info.jsp";
    private static final String SUCCEED = "ticket-info.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private boolean checkDuplicatePassport(String passport, RegistrationDTAdult[] adultCus, RegistrationDTChildren[] childrenCus) {
        for (int i = 0; i < adultCus.length; i++) {
            if (passport.equals(adultCus[i].getPassport())) {
                return false;
            }
        }
        for (int i = 0; i < childrenCus.length; i++) {
            if (passport.equals(childrenCus[i].getPassport())) {
                return false;
            }
        }
        return true;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean valid = true;
            int adultTicket = Integer.parseInt(request.getParameter("adultTicket"));
            int childrenTicket = Integer.parseInt(request.getParameter("childrenTicket"));
            RegistrationDTAdult[] adultCus = new RegistrationDTAdult[adultTicket];
            RegistrationDTChildren[] childrenCus = new RegistrationDTChildren[childrenTicket];
            RegistrationErrorAdultInfo[] adultError = new RegistrationErrorAdultInfo[adultTicket];
            RegistrationErrorChildrenInfo[] childrenError = new RegistrationErrorChildrenInfo[childrenTicket];
            String adultName, adultPhone, adultPassport, adultGender;
            String childrenName, childrenPassport, childrenGender;
            for (int i = 0; i < adultTicket; i++) {
                adultCus[i] = new RegistrationDTAdult();
                adultError[i] = new RegistrationErrorAdultInfo();
            }
            for (int i = 0; i < childrenTicket; i++) {
                childrenCus[i] = new RegistrationDTChildren();
                childrenError[i] = new RegistrationErrorChildrenInfo();
            }
            for (int i = 0; i < adultTicket; i++) {
                adultName = request.getParameter("txtCusName" + i);
                if (adultName.length() == 0) {
                    adultError[i].setNameError("Adult name can't be blank");
                    valid = false;
                }
                adultPassport = request.getParameter("txtCusPassport" + i);
                if (adultPassport.length() == 0) {
                    adultError[i].setPassportError("Adult passport can't be blank");
                    valid = false;
                } else {
                    if (!checkDuplicatePassport(adultPassport, adultCus, childrenCus)) {
                        adultError[i].setPassportError("Adult passport is duplicated");
                        valid = false;
                    }
                }
                adultPhone = request.getParameter("txtCusPhone" + i);
                if (adultPhone.length() == 0) {
                    adultError[i].setPhoneError("Adult phone can't be blank");
                    valid = false;
                } else {
                    if (!adultPhone.matches("\\d{10}")) {
                        adultError[i].setPhoneError("Adult phone must have 10 digits");
                        valid = false;
                    }
                }
                adultGender = request.getParameter("cusGender" + i);
                adultCus[i] = new RegistrationDTAdult(adultName, adultPassport, adultPhone, adultGender.equals("Male"));
            }
            for (int i = 0; i < childrenTicket; i++) {
                childrenName = request.getParameter("txtChildName" + i);
                if (childrenName.isEmpty()) {
                    childrenError[i].setNameError("Children name can't be blank");
                    valid = false;
                }
                childrenPassport = request.getParameter("txtChildPassport" + i);
                if (childrenPassport.isEmpty()) {
                    childrenError[i].setPassportError("Children passport can't be blank");
                    valid = false;
                } else {
                    if (!checkDuplicatePassport(childrenPassport, adultCus, childrenCus)) {
                        childrenError[i].setPassportError("Children passport is duplicated");
                        valid = false;
                    }
                }
                childrenGender = request.getParameter("childGender" + i);
                childrenCus[i] = new RegistrationDTChildren(childrenName, childrenPassport, childrenGender.equals("Male"));
            }
            if (valid) {
                url = SUCCEED;
                RegistrationDAO dao = new RegistrationDAO();
                HttpSession session = request.getSession();
                RegistrationDTTicket ticket = (RegistrationDTTicket) session.getAttribute("TCK");
                if (dao.addTicketAndCustomer(ticket, adultCus, childrenCus)) {
                    if (dao.updateTourTicket(adultTicket, childrenTicket, ticket.getTourID())) {
                        List<RegistrationDTTicket> listTicket = null;
                        if (session.getAttribute("TICKET") != null) {
                            listTicket = (ArrayList<RegistrationDTTicket>) session.getAttribute("TICKET");
                        } else {
                            listTicket = new ArrayList<>();
                        }
                        listTicket.add(ticket);
                        session.setAttribute("TICKET", listTicket);
                    }
                }
            } else {
                request.setAttribute("adultTicket", adultTicket);
                request.setAttribute("childrenTicket", childrenTicket);
                request.setAttribute("ADULTERROR", adultError);
                request.setAttribute("CHILDRENERROR", childrenError);
                request.setAttribute("ADULTINFO", adultCus);
                request.setAttribute("CHILDRENINFO", childrenCus);
            }
        } catch (Exception e) {
            log("ERROR at Confirm Ticket Controller: " + e.getMessage());
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
