package com.example.cruddemo.dao

import com.example.cruddemo.entity.Employee
import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class EmployeeDAOImpl(@Autowired private val entityManage: EntityManager) : EmployeeDAO {

    override fun findAll(): List<Employee> {
        val query = entityManage.createQuery("from Employee", Employee::class.java)
        return query.resultList
    }
}