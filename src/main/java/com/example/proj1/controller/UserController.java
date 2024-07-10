package com.example.proj1.controller;

import java.util.List;
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
    public List<userDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")  // frontend data recieve as json objects
    public userDTO saveUser(@RequestBody userDTO userDTO){  // json object type--> java object type
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public userDTO updateUser(@RequestBody userDTO userDTO){
        return userService.updateUserDTO(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody userDTO userDTO){
        return userService.deleteUser(userDTO);
    }
}
