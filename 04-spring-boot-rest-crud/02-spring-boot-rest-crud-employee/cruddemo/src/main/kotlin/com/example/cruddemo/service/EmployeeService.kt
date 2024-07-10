package com.example.cruddemo.service

import com.example.cruddemo.entity.Employee

interface EmployeeService {
    fun findAll(): List<Employee>
}