package com.wispne.cache.controller;

import com.wispne.cache.bean.Employee;
import com.wispne.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmp(id);
        return emp;

    }
    @GetMapping("/emp")
    public Employee updateEmployee(Employee employee){
        employeeService.updateEmp(employee);
        return employee;
    }
    @GetMapping("/delemp")
    public String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "success";
    }
}
