/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.controllers;

import duong.daos.RegistrationDAO;
import duong.dtos.RegistrationDTTour;
import duong.dtos.RegistrationErrorTour;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author hp
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class UpdateTourController extends HttpServlet {

    private static final String ERROR = "edit-tour.jsp";
    private static final String SUCCEED = "SearchTourController";

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
            RegistrationErrorTour errorObj = new RegistrationErrorTour();
            String tourID = request.getParameter("txtTourID");
            String tourName = request.getParameter("txtTourName");
            if (tourName.isEmpty()) {
                errorObj.setTourNameError("Tour name can't be blank");
                valid = false;
            }
            String departureTime = request.getParameter("dateDeparture");
            if (departureTime.isEmpty()) {
                errorObj.setDepartureTimeError("Departure time can't be blank");
                valid = false;
            }
            String arrivalTime = request.getParameter("dateArrival");
            if (arrivalTime.isEmpty()) {
                errorObj.setArrivalTimeError("Arrival time can't be blank");
                valid = false;
            }
            if (arrivalTime.compareTo(departureTime) < 0) {
                valid = false;
                errorObj.setArrivalTimeError("Arrival time can't be before departure time");
            }
            if (departureTime.compareTo(arrivalTime) > 0) {
                valid = false;
                errorObj.setDepartureTimeError("Departure time can't be after arrival time");
            }
            String departureName = request.getParameter("txtDepartureName");
            if (departureName.isEmpty()) {
                errorObj.setDepartureNameError("Departure name can't be blank");
                valid = false;
            }
            String arrivalName = request.getParameter("txtArrivalName");
            if (arrivalName.isEmpty()) {
                errorObj.setArrivalNameError("Arrival name can't be blank");
                valid = false;
            }
            String txtTicket = request.getParameter("Ticket");
            int ticket = 0;
            if (txtTicket.length() == 0) {
                valid = false;
                errorObj.setTicketError("Ticket can't be blank");
            } else {
                if (!txtTicket.matches("\\d+")) {
                    valid = false;
                    errorObj.setTicketError("Ticket must be a digits and can't be a negative number");
                } else {
                    ticket = Integer.parseInt(txtTicket);
                }
            }
            String txtPrice = request.getParameter("Price");
            float price = 0;
            if (txtPrice.length() == 0) {
                valid = false;
                errorObj.setPriceError("Price can't be blank");
            } else {
                if (!txtPrice.matches("\\d+\\.?\\d+")) {
                    valid = false;
                    errorObj.setPriceError("Price must be a digits and can't be a negative number");
                } else {
                    price = Float.parseFloat(txtPrice);
                }
            }
            String detail = request.getParameter("txtDetails");
            if (detail.isEmpty()) {
                errorObj.setDetailError("Detail can't be blank");
                valid = false;
            }
            String imageUrl = "";
            Part image = request.getPart("txtImage");
            if (!image.getSubmittedFileName().isEmpty()) {
                imageUrl = "images" + File.separator + "Tour" + File.separator + "Tour Images" + File.separator + image.getSubmittedFileName();
            } else {
                imageUrl = request.getParameter("imageUrl");
            }

            String status = request.getParameter("status");
            boolean isStatus;
            if (status != null) {
                isStatus = true;
            } else {
                isStatus = false;
            }
            boolean isDelete = request.getParameter("isDelete").equals("true");
            if (valid) {
                RegistrationDAO dao = new RegistrationDAO();
                RegistrationDTTour tour = new RegistrationDTTour(tourID, tourName, departureTime, arrivalTime, departureName, arrivalName, ticket, price, detail, isStatus, isDelete);
                tour.setImage(imageUrl);
                int count = dao.checkCustomerBoughtTour(tour.getID());
                if (count == 0) {
                    boolean result = dao.updateTour(tour);

                    if (result) {
                        if (!image.getSubmittedFileName().isEmpty()) {
                            String uploadPath = getServletContext().getRealPath("") + File.separator + "images" + File.separator + "Tour" + File.separator + "Tour Images";
                            File uploadDir = new File(uploadPath);
                            if (!uploadDir.exists()) {
                                uploadDir.mkdir();
                            }
                            image.write(uploadPath + File.separator + image.getSubmittedFileName());
                        }
                        request.setAttribute("MESSAGE", "Update succeed");
                        url = SUCCEED;
                    } else {
                        request.setAttribute("MESSAGE", "Update fail");
                        url = SUCCEED;
                    }
                } else {
                    request.setAttribute("MESSAGE", "Tour has been booked can't be updated");
                    url = SUCCEED;
                }
            } else {
                request.setAttribute("INVALID", errorObj);
                RegistrationDTTour tour = new RegistrationDTTour(tourID, tourName, departureTime, arrivalTime, departureName, arrivalName, ticket, price, detail, isStatus, isDelete);
                tour.setImage(imageUrl);
                request.setAttribute("INFO", tour);
            }
        } catch (Exception e) {
            log("ERROR at Update Tour Controller: " + e.getMessage());
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
