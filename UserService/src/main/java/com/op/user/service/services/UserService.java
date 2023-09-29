package com.op.user.service.services;

import com.op.user.service.entities.User;

import java.util.*;
public interface UserService {
    
    // User operations


    // create
    User saveUser(User user);

    // get all User
    List<User> getAllUser();

    // get single user of given userId

    User getUser(String userId);

    

}
