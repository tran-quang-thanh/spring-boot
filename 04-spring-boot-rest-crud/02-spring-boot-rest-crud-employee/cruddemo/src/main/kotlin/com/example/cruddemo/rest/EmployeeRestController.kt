package com.example.cruddemo.rest

import com.example.cruddemo.dao.EmployeeDAO
import com.example.cruddemo.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class EmployeeRestController(@Autowired private val employeeService: EmployeeService) {
    @GetMapping("/employees")
    fun findAll() = employeeService.findAll()
}