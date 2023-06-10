package com.example.kuji.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kuji.dao.CustomerOrdersDao;
import com.example.kuji.entity.CustomerOrder;

@Service
public class CustomerOrdersDomain {

    @Autowired
    private CustomerOrdersDao dao;

    public List<CustomerOrder> getCustomerOrders() throws Exception {

        List<CustomerOrder> response = dao.get();

        return response;
    }

    
    
}
