package com.codeup.springblog.controllers;

import com.codeup.springblog.respositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {
    private UserRepository userDao;

    public UserController(){}
    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }
}
