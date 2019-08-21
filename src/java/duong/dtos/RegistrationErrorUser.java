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
public class RegistrationErrorUser implements Serializable {

    private String usernameError;
    private String fullnameError;
    private String passwordError;
    private String confirmpasswordError;
    private String newpasswordError;
    private String birhdateError;
    private String phoneError;
    private String addressError;
    private String genderError;

    public RegistrationErrorUser() {
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public String getNewpasswordError() {
        return newpasswordError;
    }

    public void setNewpasswordError(String newpasswordError) {
        this.newpasswordError = newpasswordError;
    }

    public String getFullnameError() {
        return fullnameError;
    }

    public void setFullnameError(String fullnameError) {
        this.fullnameError = fullnameError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getConfirmpasswordError() {
        return confirmpasswordError;
    }

    public void setConfirmpasswordError(String confirmpasswordError) {
        this.confirmpasswordError = confirmpasswordError;
    }

    public String getBirhdateError() {
        return birhdateError;
    }

    public void setBirhdateError(String birhdateError) {
        this.birhdateError = birhdateError;
    }

    public String getPhoneError() {
        return phoneError;
    }

    public void setPhoneError(String phoneError) {
        this.phoneError = phoneError;
    }

    public String getAddressError() {
        return addressError;
    }

    public void setAddressError(String addressError) {
        this.addressError = addressError;
    }

    public String getGenderError() {
        return genderError;
    }

    public void setGenderError(String genderError) {
        this.genderError = genderError;
    }

}
