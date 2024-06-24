package com.example.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TennisCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Practice your backend volley"
    }
}