package com.example.cruddemo.service

import com.example.cruddemo.dao.EmployeeDAO
import com.example.cruddemo.entity.Employee
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(@Autowired private val employeeDAO: EmployeeDAO) : EmployeeService {
    override fun findAll(): List<Employee> {
        return employeeDAO.findAll()
    }

    override fun findById(id: Long): Employee? {
        return employeeDAO.findById(id)
    }

    @Transactional
    override fun save(employee: Employee): Employee {
        return employeeDAO.save(employee)
    }

    @Transactional
    override fun deleteById(id: Long) {
        employeeDAO.deleteById(id)
    }
}