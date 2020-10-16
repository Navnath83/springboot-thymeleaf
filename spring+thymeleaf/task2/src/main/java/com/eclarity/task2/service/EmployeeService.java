package com.eclarity.task2.service;

import java.util.List;

import com.eclarity.task2.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
 Employee getEmployeeById(long id);
 void deleteEmployeeById(long id);
}
