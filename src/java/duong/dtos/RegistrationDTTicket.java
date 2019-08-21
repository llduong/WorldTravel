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
public class RegistrationDTTicket implements Serializable {

    private String ID;
    private String tourID;
    private String username;
    private String tourname;
    private int adultTicket;
    private int childrenTicket;
    private float totalPrice;
    private int totalTicket;

    public RegistrationDTTicket() {
    }

    public RegistrationDTTicket(String ID, String tourID, String username, int adultTicket, int childrenTicket, float totalPrice) {
        this.ID = ID;
        this.tourID = tourID;
        this.username = username;
        this.adultTicket = adultTicket;
        this.childrenTicket = childrenTicket;
        this.totalPrice = totalPrice;
    }

    public int getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(int totalTicket) {
        this.totalTicket = totalTicket;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname;
    }

    public int getAdultTicket() {
        return adultTicket;
    }

    public void setAdultTicket(int adultTicket) {
        this.adultTicket = adultTicket;
    }

    public int getChildrenTicket() {
        return childrenTicket;
    }

    public void setChildrenTicket(int childrenTicket) {
        this.childrenTicket = childrenTicket;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

}
