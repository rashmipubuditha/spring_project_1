package com.example.proj1.repo;

import com.example.proj1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepo extends JpaRepository<User,Integer>{    
    //user - entity name
    //integer - primary key type

    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)  // 1--> forst argument
    User getUserbyUserId(String userId);   // first argument - userId

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2", nativeQuery = true)
    User getUserbyUserIdAddress(String userId, String address);

    // if update query use @Modifying
}

