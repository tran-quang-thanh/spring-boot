package com.example.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@Controller
class DemoController {
    @GetMapping("/hello")
    fun sayHello(model: Model): String {
        model.addAttribute("theDate", LocalDateTime.now().toString())
        return "helloworld"
    }
}