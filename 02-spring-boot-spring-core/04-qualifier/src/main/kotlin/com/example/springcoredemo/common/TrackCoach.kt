package com.example.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TrackCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Run a hard 5k!"
    }
}