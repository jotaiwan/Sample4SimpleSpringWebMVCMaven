package com.joseph.service;

import com.joseph.model.Employee;
import com.joseph.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveEmployee(Employee employee) {
		employeeRepository.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepository.findAllEmployees();
	}

	public void deleteEmployeeBySsn(String ssn) {
		employeeRepository.deleteEmployeeBySsn(ssn);
	}

	public Employee findBySsn(String ssn) {
		return employeeRepository.findBySsn(ssn);
	}

	public Employee findById(Integer id) {
		return employeeRepository.findById(id);
	}

	public void updateEmployee(Employee employee){
		employeeRepository.updateEmployee(employee);
	}
}
