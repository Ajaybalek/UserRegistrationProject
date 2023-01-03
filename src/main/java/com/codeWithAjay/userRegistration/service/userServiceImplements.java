package com.codeWithAjay.userRegistration.service;

import com.codeWithAjay.userRegistration.model.User;
import com.codeWithAjay.userRegistration.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImplements  implements userService{
    @Autowired
    private userRepository userRepo;
    @Override
    public void registerUser(User user) {
        userRepo.save(user);

    }
}
