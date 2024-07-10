package com.example.cruddemo.dao

import com.example.cruddemo.entity.Employee

interface EmployeeDAO {
    fun findAll(): List<Employee>
}