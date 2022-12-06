package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

public interface EmployeeService {
	
	
	
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws
	EmployeeException;
	

}
