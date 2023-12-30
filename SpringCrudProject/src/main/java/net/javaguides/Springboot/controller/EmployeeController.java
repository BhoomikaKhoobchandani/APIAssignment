package net.javaguides.Springboot.controller;

import net.javaguides.Springboot.model.Employee;
import net.javaguides.Springboot.response.ResponseEnum;
import net.javaguides.Springboot.service.empServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private empServiceClass empServiceClass;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return empServiceClass.getAllEmployees();
    }

    //post method
    @PostMapping
    public ResponseEntity<ResponseEnum> createEmployee(@RequestBody Employee employee){
        empServiceClass.createEmployee(employee);
//        return ResponseEntity.status(HttpStatus.OK).body()
        return new ResponseEntity<ResponseEnum>(ResponseEnum.Create_SUCCESS,
                HttpStatus.ACCEPTED);
//        return "success";

    }

    @GetMapping("{mobileNumber}")
    public ResponseEntity<Employee> findbyMobileNumber(@PathVariable String mobileNumber){
        return empServiceClass.findbyMobileNumber(mobileNumber);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeebyID(@PathVariable long id){
        return empServiceClass.getEmployeebyID(id);
    }


    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails){
        return empServiceClass.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        return empServiceClass.deleteEmployee(id);
    }
}
