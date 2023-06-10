package com.example.kuji.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.kuji.entity.Administrator;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AdministratorDao {

    private final JdbcTemplate jdbcTemplate;

    public List<Administrator> get(String userId, String password) throws SQLException, IOException {

        String sql = "select user_id, password, name from administrator where user_id = \"" + userId + "\" AND password = \"" + password + "\"";
		List<Map<String, Object>> administrator = jdbcTemplate.queryForList(sql);
		List<Administrator> list = new ArrayList<>();
		for (Map<String, Object> Administrator : administrator) {
			list.add(new Administrator(
					(String) Administrator.get("user_id"),
					(String) Administrator.get("password"),
					(String) Administrator.get("name")));
		}
		return list;
    }
    
    
}
