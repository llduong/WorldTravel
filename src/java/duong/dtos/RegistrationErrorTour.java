/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.dtos;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class RegistrationErrorTour implements Serializable {

    private String tourIDError;
    private String tourNameError;
    private String departureTimeError;
    private String arrivalTimeError;
    private String departureNameError;
    private String arrivalNameError;
    private String ticketError;
    private String priceError;
    private String detailError;
    private String imageError;

    public RegistrationErrorTour() {
    }

    public String getImageError() {
        return imageError;
    }

    public void setImageError(String imageError) {
        this.imageError = imageError;
    }

    public String getTourIDError() {
        return tourIDError;
    }

    public void setTourIDError(String tourIDError) {
        this.tourIDError = tourIDError;
    }

    public String getTourNameError() {
        return tourNameError;
    }

    public void setTourNameError(String tourNameError) {
        this.tourNameError = tourNameError;
    }

    public String getDepartureTimeError() {
        return departureTimeError;
    }

    public void setDepartureTimeError(String departureTimeError) {
        this.departureTimeError = departureTimeError;
    }

    public String getArrivalTimeError() {
        return arrivalTimeError;
    }

    public void setArrivalTimeError(String arrivalTimeError) {
        this.arrivalTimeError = arrivalTimeError;
    }

    public String getDepartureNameError() {
        return departureNameError;
    }

    public void setDepartureNameError(String departureNameError) {
        this.departureNameError = departureNameError;
    }

    public String getArrivalNameError() {
        return arrivalNameError;
    }

    public void setArrivalNameError(String arrivalNameError) {
        this.arrivalNameError = arrivalNameError;
    }

    public String getTicketError() {
        return ticketError;
    }

    public void setTicketError(String ticketError) {
        this.ticketError = ticketError;
    }

    public String getPriceError() {
        return priceError;
    }

    public void setPriceError(String priceError) {
        this.priceError = priceError;
    }

    public String getDetailError() {
        return detailError;
    }

    public void setDetailError(String detailError) {
        this.detailError = detailError;
    }

}
