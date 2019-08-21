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
public class AddTourController extends HttpServlet {

    private static final String ERROR = "insert.jsp";
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
            RegistrationErrorTour errorObj = new RegistrationErrorTour();
            RegistrationDAO dao = new RegistrationDAO();
            String TourID = request.getParameter("txtTourID");
            if (TourID.isEmpty()) {
                errorObj.setTourIDError("Tour ID can't be blank");
                valid = false;
            } else {
                if (!TourID.matches("[A-Z]{3}\\d{3}")) {
                    errorObj.setTourIDError("Tour ID must in right format 3 uppercase letter and 3 digits");
                    valid = false;
                } else {
                    if (!dao.checkDuplicateTour(TourID)) {
                        errorObj.setTourIDError("Tour ID is existed");
                        valid = false;
                    }
                }
            }
            String TourName = request.getParameter("txtTourname");
            if (TourName.isEmpty()) {
                valid = false;
                errorObj.setTourNameError("Tour name can't be blank");
            }
            String departure = request.getParameter("dateDeparture");
            if (departure.isEmpty()) {
                valid = false;
                errorObj.setDepartureTimeError("Departure time can't be empty");
            }
            String arrival = request.getParameter("dateArrival");
            if (arrival.isEmpty()) {
                valid = false;
                errorObj.setArrivalTimeError("Departure time can't be empty");
            }
            if (arrival.compareTo(departure) < 0) {
                valid = false;
                errorObj.setArrivalTimeError("Arrival time can't be before departure time");
            }
            if (departure.compareTo(arrival) > 0) {
                valid = false;
                errorObj.setDepartureTimeError("Departure time can't be after arrival time");
            }
            String departureName = request.getParameter("txtDeparturename");
            if (departureName.isEmpty()) {
                errorObj.setDepartureNameError("Departure name can't be blank");
                valid = false;
            }
            String arrivalName = request.getParameter("txtArrivalname");
            if (arrivalName.isEmpty()) {
                errorObj.setArrivalNameError("Arrival name can't be blank");
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
            String details = request.getParameter("txtDetails");
            if (details.isEmpty()) {
                valid = false;
                errorObj.setDetailError("Detail can't be blank");
            }
            Part image = request.getPart("txtImage");
            if(image.getSubmittedFileName().isEmpty()){
                errorObj.setImageError("Must have image for tour");
                valid = false;
            }
            String imageUrl = "images" + File.separator + "Tour" + File.separator + "Tour Images" + File.separator + image.getSubmittedFileName();

            RegistrationDTTour tour = new RegistrationDTTour(TourID, TourName, departure, arrival, departureName, arrivalName, ticket, price, details, true, false);
            tour.setImage(imageUrl);
            if (valid) {

                boolean result = dao.insertTour(tour);

                if (result) {

                    String uploadPath = getServletContext().getRealPath("") + File.separator + "images" + File.separator + "Tour" + File.separator + "Tour Images";
                    File uploadDir = new File(uploadPath);
                    if (!uploadDir.exists()) {
                        uploadDir.mkdir();
                    }
                    image.write(uploadPath + File.separator + image.getSubmittedFileName());
                    request.setAttribute("MESSAGE", "Insert Succeed");
                    url = SUCCEED;
                } else {
                    request.setAttribute("MESSAGE", "Insert Fail");
                }
            } else {
                request.setAttribute("INVALID", errorObj);
                request.setAttribute("INFO", tour);
            }
        } catch (Exception e) {
            log("ERROR at Add Tour Controller: " + e.getMessage());
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
