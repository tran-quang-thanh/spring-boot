package com.example.cruddemo.dao

import com.example.cruddemo.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path="members")
interface EmployeeRepository : JpaRepository<Employee, Long> {
}