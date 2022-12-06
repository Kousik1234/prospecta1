package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
    @Autowired
	private EmployeeService empservice;
	
	
  //  Q no 1 in coding chalange
    
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getemployeebyempidandeller(@PathVariable("empId") Integer empId) throws EmployeeException{

		
		Employee emp=empservice.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
		
		
	}
	
//	Q no 2 in coding chalange
		
		@GetMapping("/edto")
		public ResponseEntity<List<EmployeeDTO>> getNameAddressSalaryOfAllEmployee() throws EmployeeException{
			
		List<EmployeeDTO> emp1 = empservice.getNameAddressSalaryOfAllEmployee();
		
		
		return new ResponseEntity<List<EmployeeDTO>>(emp1,HttpStatus.OK);
		
		}

	
	
	
	
	
	
	
}
