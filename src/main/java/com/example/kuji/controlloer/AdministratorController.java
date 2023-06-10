package com.example.kuji.controlloer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kuji.domain.AdministratorDomain;
import com.example.kuji.entity.Administrator;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorDomain domain;


    @GetMapping("/administrator")
    public List<Administrator> getAdministrator(@RequestParam String userId, @RequestParam String password) throws Exception {

        List<Administrator> response = domain.getAdministrator(userId, password);

        return response;
    }

    
}
