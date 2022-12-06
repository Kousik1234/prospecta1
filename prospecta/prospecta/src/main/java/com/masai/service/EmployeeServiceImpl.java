package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repositry.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;


	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt=dao.findById(empId);
		
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new EmployeeException("Employee does not exist with this empId "+empId);
			
		}
		
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		
		List<EmployeeDTO> dtos=dao.getEmployeeNameAddressSalary();
		
		if(dtos.size()>0) {
			return dtos;
		}else {
			throw new EmployeeException("No record found");
		}
		
	}

}
