/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dem.Service;

import com.example.dem.model.User;
import com.example.dem.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.print.DocFlavor;
import java.util.List;
import com.example.dem.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
  
    public boolean CheckUser(Register usr){
        if(repository.findByEmail(usr.getEmail()) == null){
            return true;
        }
        return false;
    }
    public void createUser(User user){
        
        repository.save(user);
    }

    public boolean Login(String email, String password){
        User user = repository.findByEmail(email);
        if (user == null)
            return false;
        return user.getPassword().equals(password);
    }

    public User getUser(String email){
        return repository.findByEmail(email);
    }

    public boolean updateUser(String user, String email, String fullname,String DOB,String Gender){
        User user_ = repository.findByEmail(user);
        if(user_ == null)
            return false;
        if(!fullname.isEmpty())
            user_.setFullname(fullname) ;
        if(!email.isEmpty())
            user_.setEmail(email);
        if(!DOB.isEmpty())
            user_.setDOB(DOB);
        if(!Gender.isEmpty())
            user_.setGender(Gender);
        repository.save(user_);
        return true;
    }

    public boolean changePassword(String email, String oldpassword, String newPassword){
        User user = repository.findByEmail(email);
        if (user == null)
            return false;
        if(!user.getPassword().equals(oldpassword))
            return false;
        user.setPassword(newPassword);
        repository.save(user);
        return true;
    }

    public boolean Delete(String email){
        User user = repository.findByEmail(email);
        if (user == null)
            return false;
        
        repository.delete(user);
        return true;
    }
}
