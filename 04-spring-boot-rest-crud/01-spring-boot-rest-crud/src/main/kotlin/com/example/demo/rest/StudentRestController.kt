package com.example.demo.rest

import com.example.demo.entity.Student
import jakarta.annotation.PostConstruct
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class StudentRestController {
    private lateinit var theStudents : List<Student>

    @PostConstruct
    fun loadData() {
        theStudents = listOf(
            Student("Poornima", "Patel"),
            Student("Mario", "Rossi"),
            Student("Marry", "Smith")
        )
    }

    @GetMapping("/students")
    fun getStudents(): List<Student> {
        return theStudents
    }

    @GetMapping("/students/{studentId}")
    fun getStudentById(@PathVariable studentId: Int): Student {
        if (studentId < 0 || studentId >= theStudents.size) {
            throw StudentNotFoundException("Student id not found - $studentId")
        }
        return theStudents[studentId]
    }
}