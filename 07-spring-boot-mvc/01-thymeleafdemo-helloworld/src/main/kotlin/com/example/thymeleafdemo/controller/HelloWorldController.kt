package com.example.thymeleafdemo.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HelloWorldController {
    @GetMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/processForm")
    fun processForm(): String {
        return "helloworld"
    }

    @RequestMapping("/processFormVersionTwo")
    fun processFormVersionTwo(request: HttpServletRequest, model: Model): String {
        val name = request.getParameter("studentName").uppercase()
        val result = "Yo $name"
        model.addAttribute("message", result)
        return "helloworld"
    }

    @GetMapping("/processFormVersionThree")
    fun processFormVersionThree(
        @RequestParam(value = "studentName") studentName: String,
        model: Model
    ): String {
        val result = "Hey my friend from V3! ${studentName.uppercase()}"
        model.addAttribute("message", result)
        return "helloworld"
    }
}