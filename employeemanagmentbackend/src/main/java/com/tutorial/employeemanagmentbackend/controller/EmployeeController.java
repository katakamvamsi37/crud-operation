package com.tutorial.employeemanagmentbackend.controller;

import com.tutorial.employeemanagmentbackend.model.Employee;
import com.tutorial.employeemanagmentbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; //we are bringing in Employee Service instance

    @GetMapping("/home")
    public String getSome() {
    	return "home page";
    }
    
    
    /**This is a post Request, here we are gonna ba saving an employee*/
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
    	employeeService.saveEmployee(employee);
        System.out.println("Received Employee Data: " + employee);
        return ResponseEntity.ok(employee); // Simulating save operation
    }
        /** Here, we are getting all employee*/
    @GetMapping("/get")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
     /**here, we are geting one empployee*/
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
        /**here, we get gonna be updating an employee*/
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
      /**Here, we are gonna be deleting an employee*/
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
