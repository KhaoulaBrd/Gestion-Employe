package com.example.Employee.Service;

import com.example.Employee.Model.Employee;
import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
}
