package com.example.springcoredemo.rest

import com.example.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(@Qualifier("baseballCoach") coach: Coach) {
    private val myCoach = coach

    @GetMapping("/dailyworkout")
    fun getDailyWorkout(): String {
        return myCoach.getDailyWorkout()
    }
}