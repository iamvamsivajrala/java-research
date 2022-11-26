package com.research.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "research")
public class ResearchController {

	@GetMapping
	public String getEmpoyeeName() {
		return "vamsi";
	}

	@PostMapping
	public String insertEmployee() {
		return "inserting vamsi details";
	}

	@DeleteMapping
	public String delEmployee() {
		return "del emp";
	}

	@PutMapping
	public String updateEmployee() {
		return "put emp";
	}
	
	@GetMapping("/{employeeId}")
	public String getEmployeeDetailsById(@PathVariable int employeeId) {
		if(employeeId==1) {
			return "vamsi";
		}
		else if(employeeId==2) {
			return "kishore";
		}
		else {
			return "default";
		}
	}
}
