package com.fngeno.user.controller;

import com.fngeno.user.entity.User;
import com.fngeno.user.service.UserService;
import com.fngeno.user.valueobjects.ResponseTemplateMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
   // private Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public User saveUser(@RequestBody User user){
     //   log.info("Inside saveUser controller");
        return userService.saveUser(user);
    }
    @GetMapping
    public ResponseTemplateMapper getUserAndDepartment(@PathVariable("id") Long userId){
     //   log.info("Inside getUserAndDepartment of UserController");
        return userService.getUserAndDepartment(userId);
    }



}

