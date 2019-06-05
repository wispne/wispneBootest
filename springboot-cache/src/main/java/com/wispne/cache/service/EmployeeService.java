package com.wispne.cache.service;

import com.wispne.cache.bean.Employee;
import com.wispne.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public Employee getEmp(Integer id){
        Employee emp= employeeMapper.getEmpById(id);
        return emp;
    }
}
