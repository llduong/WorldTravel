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
public class RegistrationErrorChildrenInfo implements Serializable {

    private String nameError, passportError, genderError;

    public RegistrationErrorChildrenInfo() {
    }

    public String getNameError() {
        return nameError;
    }

    public void setNameError(String nameError) {
        this.nameError = nameError;
    }

    public String getPassportError() {
        return passportError;
    }

    public void setPassportError(String passportError) {
        this.passportError = passportError;
    }

    public String getGenderError() {
        return genderError;
    }

    public void setGenderError(String genderError) {
        this.genderError = genderError;
    }

}
