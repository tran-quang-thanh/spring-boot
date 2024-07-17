package com.example.thymeleafdemo.controller

import com.example.thymeleafdemo.model.Student
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class StudentController {

    @Value("\${countries}")
    private val countries: List<String> = listOf()

    @Value("\${languages}")
    private val languages: List<String> = listOf()

    @Value("\${systems}")
    private val systems: List<String> = listOf()

    @GetMapping("/showStudentForm")
    fun showForm(model: Model): String {
        model.addAttribute("student", Student())
        model.addAttribute("countries", countries)
        model.addAttribute("languages", languages)
        model.addAttribute("systems", systems)
        return "student-form"
    }

    @PostMapping("/processStudentForm")
    fun processStudentForm(@ModelAttribute("student") student: Student): String {
        println("The student: ${student.firstName} ${student.lastName}")
        return "student-confirmation"
    }
}