package com.example.proj1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor  //since lombok
@AllArgsConstructor
@Data

public class User {

    @Id   // primary key
    private int id;
    private String name;
    private String address;
    
}
