package com.example.cruddemo.dao

import com.example.cruddemo.entity.Student

interface StudentDAO {
    fun save(student: Student)
    fun findById(id: Int): Student?
    fun findAll(): List<Student>
    fun findByLastName(lastName: String): List<Student>
}