package com.masai.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	

		
		@Query("select new com.masai.model.EmployeeDTO(e.name,e.salary,e.address) from Employee e")
		public List<EmployeeDTO> getEmployeeNameAddressSalary();
	
	

}
