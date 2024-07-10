package com.example.proj1.repo;

import com.example.proj1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User,Integer>{    
    //user - entity name
    //integer - primary key type
}

