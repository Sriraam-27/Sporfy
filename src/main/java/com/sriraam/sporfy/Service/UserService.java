package com.sriraam.sporfy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriraam.sporfy.Entity.User;
import com.sriraam.sporfy.Repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveDetails(User user){

        return userRepo.save(user);

    }
}
