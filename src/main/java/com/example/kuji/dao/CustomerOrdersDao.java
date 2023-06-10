package com.example.kuji.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.kuji.dao.mapper.customerorders.CustomerOrdersMapper;
import com.example.kuji.entity.CustomerOrder;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CustomerOrdersDao {

	@Autowired
    CustomerOrdersMapper mapper;
	
    private final JdbcTemplate jdbcTemplate;

    public List<CustomerOrder> get() throws SQLException, IOException {

		List<CustomerOrder> customerOrders = mapper.getCustomerOrders();
		return customerOrders;
    }
    
    public List<CustomerOrder> post(CustomerOrder customerOrder) throws SQLException, IOException {

        String sql = "TRUNCATE TABLE CUSTOMERORDER; INSRET INTO CUSTOMERORDER(id, division, group, name, drink) VALUES(" + customerOrder.getId() + ", " + customerOrder.getDivision() + ", " + customerOrder.getGroup() + ", " + customerOrder.getName() + ", " + customerOrder.getDrink() + ")";
		List<Map<String, Object>> customerOrders = jdbcTemplate.queryForList(sql);
		List<CustomerOrder> list = new ArrayList<>();
		for (Map<String, Object> CustomerOrder : customerOrders) {
			list.add(new CustomerOrder(
					(Integer) CustomerOrder.get("id"),
					(String) CustomerOrder.get("division"),
					(String) CustomerOrder.get("group"),
					(String) CustomerOrder.get("name"),
					(String) CustomerOrder.get("drink")));
		}
		return list;
    }
    
}

