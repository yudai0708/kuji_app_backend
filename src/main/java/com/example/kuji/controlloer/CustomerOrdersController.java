package com.example.kuji.controlloer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kuji.domain.CustomerOrdersDomain;
import com.example.kuji.entity.CustomerOrder;

@RestController
public class CustomerOrdersController {

    @Autowired
    private CustomerOrdersDomain domain;


    @GetMapping("/customer-orders")
    public List<CustomerOrder> getCustomerOrders() throws Exception {

        List<CustomerOrder> response = domain.getCustomerOrders();

        return response;
    }

    @PostMapping("/customer-orders")
    public List<CustomerOrder> postCustomerOrders(@RequestBody CustomerOrder request) throws Exception {

        List<CustomerOrder> response = domain.postCustomerOrders(request);

        return response;
    }

    
}
