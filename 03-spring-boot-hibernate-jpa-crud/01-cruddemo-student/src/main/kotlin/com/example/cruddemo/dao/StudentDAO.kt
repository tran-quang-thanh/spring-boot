package com.example.cruddemo.dao

import com.example.cruddemo.entity.Student

interface StudentDAO {
    fun save(student: Student)
}