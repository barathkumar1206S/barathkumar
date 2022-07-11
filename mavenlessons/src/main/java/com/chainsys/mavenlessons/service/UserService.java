package com.chainsys.mavenlessons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.mavenlessons.entity.User;
import com.chainsys.mavenlessons.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository uRepo;
    
    public void addUser(User user) {
        uRepo.save(user);
    }
    public User findUserById(int id) {
        return uRepo.findById(id);
    }
    public List<User> getUsers(){
        return uRepo.findAll();
    }
    public void modifyUser(User user) {
//        TODO: validate User.id before uRepo.save()
        uRepo.save(user);
    }
    public void deleteUserById(int id) {
        uRepo.deleteById(id);
    } 
}