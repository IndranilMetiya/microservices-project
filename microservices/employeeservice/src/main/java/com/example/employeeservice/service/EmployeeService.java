//package com.example.employeeservice.service;
//
//import com.example.employeeservice.entity.Employee;
//import com.example.employeeservice.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    public Employee getEmployeeById(Long id) {
//        return employeeRepository.findById(id).orElseThrow(() -> 
//            new RuntimeException("Employee not found with id: " + id));
//    }
//
//    public Employee saveEmployee(Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    public Employee updateEmployee(Long id, Employee updatedEmployee) {
//        Employee existingEmployee = getEmployeeById(id);
//        existingEmployee.setName(updatedEmployee.getName());
//        existingEmployee.setDepartment(updatedEmployee.getDepartment());
//        existingEmployee.setSalary(updatedEmployee.getSalary());
//        return employeeRepository.save(existingEmployee);
//    }
//
//    public void deleteEmployee(Long id) {
//        employeeRepository.deleteById(id);
//    }
//}
//
