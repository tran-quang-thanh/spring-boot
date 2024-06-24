package com.example.springcoredemo.common

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Component
class TrackCoach : Coach {
    init {
        println("Initializing " + this.javaClass.simpleName)
    }

    override fun getDailyWorkout(): String {
        return "Run a hard 5k!"
    }
}