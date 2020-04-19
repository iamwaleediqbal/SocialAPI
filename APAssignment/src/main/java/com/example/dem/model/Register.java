package com.example.dem.model;
import java.util.*;

public class Register {
    private String email;
    private String password;
    private String fullname;
    private String DOB;
    private String Gender;

    public String getEmail() {
        return email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    @Override
    public String toString() {
        return String.format(
                "User[ FullName='%s', Email='%s' , DOB='%s', gender='%s']",
                 fullname, email,DOB,Gender);
    }
}
