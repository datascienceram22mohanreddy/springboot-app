package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	@PostMapping("/postdata")
	public ResponseEntity<String> post(@RequestBody EmployeeEntity ee){
		es.save(ee);
		return ResponseEntity.ok("Successfully sent");
	}
	@GetMapping("/getdata")
	public List<EmployeeEntity> get() {
		return es.getData();
	}
}
