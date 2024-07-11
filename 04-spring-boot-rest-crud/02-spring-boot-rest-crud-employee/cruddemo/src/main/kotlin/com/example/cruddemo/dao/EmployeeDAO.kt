package com.example.cruddemo.dao

import com.example.cruddemo.entity.Employee

interface EmployeeDAO {
    fun findAll(): List<Employee>
    fun findById(id: Long): Employee?
    fun save(employee: Employee): Employee
    fun deleteById(id: Long)
}