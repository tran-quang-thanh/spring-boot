package com.example.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class CricketCoach : Coach {
    init {
        println("Initializing " + this.javaClass.simpleName)
    }

    override fun getDailyWorkout(): String {
        return "Practice fast bowling for 15 minutes"
    }
}