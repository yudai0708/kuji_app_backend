package com.example.kuji.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.kuji.dao.mapper.customerorders.CustomerOrdersMapper;
import com.example.kuji.entity.CustomerOrder;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CustomerOrdersDao {

	@Autowired
    CustomerOrdersMapper mapper;


    public List<CustomerOrder> get() throws SQLException, IOException {

		List<CustomerOrder> customerOrders = mapper.getCustomerOrders();
		return customerOrders;
    }
    
    
}
