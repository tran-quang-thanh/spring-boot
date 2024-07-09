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

    override fun findById(id: Int): Student? {
        return entityManager.find(Student::class.java, id)
    }

    override fun findAll(): List<Student> {
        val query = entityManager.createQuery("FROM Student", Student::class.java)
        return query.resultList
    }

    override fun findByLastName(lastName: String): List<Student> {
        val query = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student::class.java)
        query.setParameter("theData", lastName)
        return query.resultList
    }

    @Transactional
    override fun update(student: Student) {
        entityManager.merge(student)
    }
}