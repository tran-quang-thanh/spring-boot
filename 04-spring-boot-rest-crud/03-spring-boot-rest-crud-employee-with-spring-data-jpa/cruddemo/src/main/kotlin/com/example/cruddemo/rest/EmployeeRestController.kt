package com.example.cruddemo.rest

import com.example.cruddemo.entity.Employee
import com.example.cruddemo.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class EmployeeRestController(@Autowired private val employeeService: EmployeeService) {
    @GetMapping("/employees")
    fun findAll() = employeeService.findAll()

    @GetMapping("/employees/{id}")
    fun findById(@PathVariable id: Long): Employee {
        val result = employeeService.findById(id)

        if (result.isPresent) {
            return result.get()
        }

        throw Exception("Did not find employee id - $id")
    }

    @PostMapping("/employees")
    fun addEmployee(@RequestBody employee: Employee): Employee {
        employee.setId(0)
        return employeeService.save(employee)
    }

    @PutMapping("/employees")
    fun updateEmployee(@RequestBody employee: Employee): Employee {
        return employeeService.save(employee)
    }

    @DeleteMapping("/employees/{id}")
    fun deleteEmployee(@PathVariable id: Long): String {
        if (!employeeService.findById(id).isPresent) {
            throw Exception("employee id not found - $id")
        }
        employeeService.deleteById(id)
        return "Deleted employee id - $id"
    }
}