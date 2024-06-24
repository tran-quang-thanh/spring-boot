package com.example.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class BaseballCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Spend 30 minutes in batting practice"
    }
}