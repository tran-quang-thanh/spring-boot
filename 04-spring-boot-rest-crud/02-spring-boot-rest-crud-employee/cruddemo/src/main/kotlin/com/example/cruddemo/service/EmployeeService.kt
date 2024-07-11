package com.example.cruddemo.service

import com.example.cruddemo.entity.Employee

interface EmployeeService {
    fun findAll(): List<Employee>
    fun findById(id: Long): Employee?
    fun save(employee: Employee): Employee
    fun deleteById(id: Long)
}