package com.example.springcoredemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController @Autowired constructor(theCoach: Coach) {
    private val myCoach: Coach = theCoach

    @GetMapping("/dailyworkout")
    fun getDailyWorkout(): String {
        return myCoach.getDailyWorkout()
    }
}