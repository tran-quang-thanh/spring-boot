package com.example.cruddemo.service

import com.example.cruddemo.dao.EmployeeDAO
import com.example.cruddemo.entity.Employee
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(@Autowired private val employeeDAO: EmployeeDAO) : EmployeeService {
    override fun findAll(): List<Employee> {
        return employeeDAO.findAll()
    }
}