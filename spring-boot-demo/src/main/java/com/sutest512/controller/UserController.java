package com.sutest512.controller;


import com.sutest512.entity.User;
import com.sutest512.service.UserService;
import com.sutest512.service.UserServicei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;


@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServicei userServicei;

    @GetMapping("/user-list")
    public String list() {
        return "Started";
    }

    @GetMapping("/user-list2")
    public String findAll(Model model) {
        List<User> userList = userServicei.findAll();
        model.addAttribute("userList", userList);
        return "testFront";
    }


}

