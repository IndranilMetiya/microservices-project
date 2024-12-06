package com.example.employeeservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@GetMapping
  public String getAllEmployees() {
      return "Hi";
  }

//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping("/{id}")
//    public Employee getEmployeeById(@PathVariable Long id) {
//        return employeeService.getEmployeeById(id);
//    }
//
//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }
//
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
//        return employeeService.updateEmployee(id, updatedEmployee);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteEmployee(@PathVariable Long id) {
//        employeeService.deleteEmployee(id);
//        return "Employee with id " + id + " deleted successfully!";
//    }
}

