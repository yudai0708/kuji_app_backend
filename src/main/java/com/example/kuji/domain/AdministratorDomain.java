package com.example.kuji.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kuji.dao.AdministratorDao;
import com.example.kuji.entity.Administrator;

@Service
public class AdministratorDomain {

    @Autowired
    private AdministratorDao dao;

    public List<Administrator> getAdministrator(String userId, String password) throws Exception {

        List<Administrator> response = dao.get(userId, password);

        return response;
    }

}