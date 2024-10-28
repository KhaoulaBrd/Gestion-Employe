package com.example.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepo;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        if (employeeRepo.existsById(id)) {
            employee.setId(id);  // Ensure ID matches for update
            return employeeRepo.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
