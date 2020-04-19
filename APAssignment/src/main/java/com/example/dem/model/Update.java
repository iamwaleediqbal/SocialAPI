/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dem.model;

/**
 *
 * @author itswa
 */
public class Update {

   
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String fullname = "";
    private String email = "";
    private String DOB = "";
    private String gender = "";
    
     @Override
    public String toString() {
        return String.format(
                "User[ fullname='%s', email='%s' , date='%s', gender='%s']",
                 fullname,email,DOB,gender);
    }

}
