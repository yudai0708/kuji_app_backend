package com.example.kuji.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Administrator {

    private String userId;
    private String password;
    private String name;
    
}
