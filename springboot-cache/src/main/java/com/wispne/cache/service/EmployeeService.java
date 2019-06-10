package com.wispne.cache.service;

import com.wispne.cache.bean.Employee;
import com.wispne.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Cacheable(value = {"emp"})
    public Employee getEmp(Integer id){
        System.out.println("查询"+id+"号员工");
        Employee emp= employeeMapper.getEmpById(id);
        return emp;

    }
    @CachePut(value={"emp"},key="#result.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmployee(employee);
        return employee;
    }
    @CacheEvict(value = "emp")
    public void deleteEmp(Integer id){
        System.out.println("");
        employeeMapper.deleteEmpById(id);
    }
}
