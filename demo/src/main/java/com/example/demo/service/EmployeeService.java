package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	public void save(EmployeeEntity e) {
		er.save(e);
	}
	public List<EmployeeEntity> getData(){
		return er.findAll();

	}

}
