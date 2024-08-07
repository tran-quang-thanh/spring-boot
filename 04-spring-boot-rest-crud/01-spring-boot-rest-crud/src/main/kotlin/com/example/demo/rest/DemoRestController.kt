package com.example.demo.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class DemoRestController {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }
}