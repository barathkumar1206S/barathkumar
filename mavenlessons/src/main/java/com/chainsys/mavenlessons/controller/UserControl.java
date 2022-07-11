package com.chainsys.mavenlessons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.chainsys.mavenlessons.entity.Passport;
import com.chainsys.mavenlessons.entity.User;
import com.chainsys.mavenlessons.service.UserService;

@RestController
@RequestMapping("user")
public class UserControl {
    @Autowired
    private UserService userservices;
    private String redirectUrl = "/fetchallusers"; 
    @GetMapping(value = "/fetchpassportbyusersid" ,produces = "application/json")
    public Passport getPassport(int id) {
        User user=userservices.findUserById(id);
        Passport passport=user.getPassport();
        System.out.println("user passport is null" + (passport==null));
        return passport;
    }
    @GetMapping(value = "/fetchuserbyid", produces = "application/json")
    public User getUser(int id) {
        return userservices.findUserById(id);
    }
    @GetMapping(value = "/fetchallusers" ,produces = "application/json")
    public List<User> listUsers() {
        return userservices.getUsers();
    }
    @PostMapping(value = "/addnewuser", consumes = "application/json")
    public RedirectView addUser(User user) {
        userservices.addUser(user);
        return new RedirectView(redirectUrl);
    }
    @PostMapping(value = "/modifyuser", consumes = "application/json")
    public RedirectView updateUser(User user) {
        userservices.modifyUser(user);
        return new RedirectView(redirectUrl);
    }
    @DeleteMapping(value = "/removeuserbyid")
    public RedirectView deleteUser(int id) {
        userservices.deleteUserById(id);
        return new RedirectView(redirectUrl);
    }
}