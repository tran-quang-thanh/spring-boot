package com.example.cruddemo.service

import com.example.cruddemo.dao.EmployeeRepository
import com.example.cruddemo.entity.Employee
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(@Autowired private val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun findAll(): List<Employee> {
        return employeeRepository.findAll()
    }

    override fun findById(id: Long): Optional<Employee> {
        return employeeRepository.findById(id)
    }

    override fun save(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun deleteById(id: Long) {
        employeeRepository.deleteById(id)
    }
}