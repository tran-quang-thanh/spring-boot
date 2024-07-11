package com.example.cruddemo.service

import com.example.cruddemo.entity.Employee
import java.util.Optional

interface EmployeeService {
    fun findAll(): List<Employee>
    fun findById(id: Long): Optional<Employee>
    fun save(employee: Employee): Employee
    fun deleteById(id: Long)
}