package com.example.proj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj1.dto.userDTO;
import com.example.proj1.service.userService;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired  // inject
    private userService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Rashmi";
    }

    @PostMapping("/saveUser")  // frontend data recieve as json objects
    public userDTO saveUser(@RequestBody userDTO userDTO){  // json object type--> java object type
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "user updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "user deleted";
    }
}
