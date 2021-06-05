package com.example.dem.model;

import java.util.*;
import org.springframework.data.annotation.Id;


public class User {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    private String password = "";
    private String DOB = "";
    private String gender = "";

    public User() {}

    public User(String fullname, String email, String password,String DOB,String gender) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return String.format(
                "User[fullname='%s', email='%s' , gender='%s', date of birth='%s']",
                 fullname, email,gender,DOB);
    }

}