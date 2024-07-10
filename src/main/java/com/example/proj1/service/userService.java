package com.example.proj1.service;

import java.util.List;
import com.example.proj1.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj1.dto.userDTO;
import com.example.proj1.repo.userRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class userService {

    // inject repository
    @Autowired
    private userRepo userRepo;  // inject

    @Autowired
    private ModelMapper modelMapper;   // pass data fromm user DTO to user

    // DTO - data transfer object
    // take the entity from postmapping saveUser --> service through save in repo
    public userDTO saveUser(userDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));  // userDTO pass to user entity
        return userDTO;
    }

    // fetch data from database
    public List<userDTO> getAllUsers(){
        List<User>userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<userDTO>>(){}.getType());
    }

    // update data
    public userDTO updateUserDTO (userDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    // Delete data
    public boolean deleteUser(userDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }
}
