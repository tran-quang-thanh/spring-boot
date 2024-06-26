package com.example.cruddemo.dao

import com.example.cruddemo.entity.Student
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class StudentDAOImpl(@Autowired private val entityManager: EntityManager) : StudentDAO {

    @Transactional
    override fun save(student: Student) {
        entityManager.persist(student)
    }
}