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
public class RegistrationDTAdult implements Serializable{
    
    private String name;
    private String passport;
    private String phoneNo;
    private boolean gender;

    public RegistrationDTAdult(String name, String passport, String phoneNo, boolean gender) {
        this.name = name;
        this.passport = passport;
        this.phoneNo = phoneNo;
        this.gender = gender;
    }

    public RegistrationDTAdult() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
    
}
