package net.javaguides.Springboot.service;

import net.javaguides.Springboot.exception.ResourceNotFoundException;
import net.javaguides.Springboot.model.Employee;
import net.javaguides.Springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
//import org.json.JSONArray;
//import org.json.JSONObject;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class empServiceClass {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //post method
    @PostMapping
    public void createEmployee(@RequestBody Employee employee){
        Employee storedId= employeeRepository.findbyLeadId(employee.getLeadId());
        if(storedId!=null) throw new ResourceNotFoundException("nhi mila");
        employeeRepository.save(employee);

    }

    @GetMapping("{mobileNumber}")
    public ResponseEntity<Employee> findbyMobileNumber(@PathVariable String mobileNumber){
        Employee emp=employeeRepository.findbyMobileNumber(mobileNumber);
        return ResponseEntity.ok(emp);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeebyID(@PathVariable long id){
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("employee not exist with id "+ id));
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("employee not exist with this id"));
        updateEmployee.setFirstname(employeeDetails.getFirstname());
        updateEmployee.setLastname(employeeDetails.getLastname());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);
        return  ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Employee deleteEmployee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("employee not exist with this id"));
        employeeRepository.delete(deleteEmployee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
