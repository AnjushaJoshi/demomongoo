package com.example.demomongoo.Controller;

import com.example.demomongoo.model.Employee;
import com.example.demomongoo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController

{
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value = "/saveemp")
    public String saveEmp(@RequestBody Employee employee)
    {
        employeeRepo.save(employee);
        return "saved employee with id:" +employee.getId();
    }

    @GetMapping("/findemp")
    public List<Employee> getEmp()
    {

        return employeeRepo.findAll();
    }

    @GetMapping("/findempbyid/{id}")
    public Optional<Employee> findById(@PathVariable String id)
    {

        return employeeRepo.findById(id);
    }

    @DeleteMapping("/deleteempbyid/{id}")
    public String deleteemp(@PathVariable String id)
    {
        employeeRepo.deleteById(id);
        return "deleted employee with id:" +id;
    }
    
}





