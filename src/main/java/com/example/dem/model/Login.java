package com.example.dem.model;
import com.example.dem.model.User;

public class Login {
    private String email;
    private String password;

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
    
    public String toString(User usr){
         
        return String.format(
                "User[id=%s, FullName='%s', emailName='%s' , date='%s', gender='%s']",
                usr.getId(), usr.getFullname(), usr.getEmail(),usr.getDOB(),usr.getGender());
    }
}
