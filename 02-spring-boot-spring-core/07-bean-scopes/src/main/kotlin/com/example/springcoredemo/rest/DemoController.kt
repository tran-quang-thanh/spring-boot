package com.example.springcoredemo.rest

import com.example.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    @Qualifier("cricketCoach") coach: Coach,
    @Qualifier("cricketCoach") theAnotherCoach: Coach
) {
    private val myCoach = coach
    private val anotherCoach = theAnotherCoach

    init {
        println("Initializing " + this.javaClass.simpleName)
    }

    @GetMapping("/dailyworkout")
    fun getDailyWorkout(): String {
        return myCoach.getDailyWorkout()
    }

    @GetMapping("/check")
    fun check(): String {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach).toString()
    }
}