package com.example.kuji.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerOrder {

    private Integer id;
    private String division;
    private String group;
    private String name;
    private String drink;
    
}
