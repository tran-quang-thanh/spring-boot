package com.example.springcoredemo.rest

import com.example.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    private lateinit var myCoach: Coach

    @Autowired
    fun setCoach(coach: Coach) {
        myCoach = coach
    }

    @GetMapping("/dailyworkout")
    fun getDailyWorkout(): String {
        return myCoach.getDailyWorkout()
    }
}