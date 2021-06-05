package com.example.dem.Controller;

import com.example.dem.Service.UserService;
import com.example.dem.model.Register;
import com.example.dem.model.User;
import com.example.dem.model.Login;
import com.example.dem.model.ChangePassword;
import com.example.dem.model.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private String Email = "";
    @GetMapping (value = "/register", produces = "application/json")
    public String Reg(){
        return "Please Provide data in json format/n";
    }
    @PostMapping("/register")
    public String Register(@RequestBody Register body) {
        if(userService.CheckUser(body)){
            userService.createUser(new User(body.getFullname(), body.getEmail(), body.getPassword(),body.getDOB(),body.getGender()));
            return body.toString();
        }
        return "User Already Exists";
    }

    
    @PostMapping("/login")
    public String Login(@RequestBody Login body) {
        if(Email != ""){
            return "Some User already logged in";
        }

        if (userService.Login(body.getEmail(), body.getPassword())){
            Email = body.getEmail();
            User usr = userService.getUser(body.getEmail()); 
            return usr.toString();  
        }
        return "User Not Found";
    }

    
    @PutMapping("/update")
    public String update(@RequestBody Update Body){
        if(Email ==  ""){
            return "No User Logged in right now";
        }

        if(userService.updateUser(Email, Body.getEmail(), Body.getFullname(),Body.getDOB(),Body.getGender())){
            if(Body.getEmail() != "" && !Body.getEmail().equals(Email))
                Email = Body.getEmail();
            return userService.getUser(Email).toString();
        }
        return "User not found";
    }
    

    @PutMapping("/changepassword")
    public String changePassword(@RequestBody ChangePassword body) {
        if(Email == null){
            return "No User Logged in right now";
        }
        if(userService.changePassword(Email, body.getOldpassword(), body.getNewPassword()))
            return "Password Changed";
        return "User not found";
    }

    @DeleteMapping("/delete")
    public String Delete() {
        if (userService.Delete(Email)){
            Email = "";
            return "Account Deleted";
        }
        return "No User Logged in Right now";
    }


    @GetMapping("/logout")
    public String Logout() {
        if (userService.getUser(Email) != null){
            Email = "";
            return "Logged Out";
        }
        return "No User Logged in right now";
    }

}