package com.example.kuji.dao.mapper.customerorders;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.kuji.entity.CustomerOrder;

@Mapper
public interface CustomerOrdersMapper {
    
    List<CustomerOrder> getCustomerOrders();
}
