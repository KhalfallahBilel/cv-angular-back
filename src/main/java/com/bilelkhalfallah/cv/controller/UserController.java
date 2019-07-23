package com.bilelkhalfallah.cv.controller;


import com.bilelkhalfallah.cv.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    public UserController() {
    }

    @Autowired
    IUserRepository iUserRepository;


}
