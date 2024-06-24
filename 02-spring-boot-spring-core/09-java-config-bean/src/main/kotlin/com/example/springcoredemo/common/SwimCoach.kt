package com.example.springcoredemo.common

import org.springframework.stereotype.Component

class SwimCoach : Coach {
    init {
        println("Initializing " + this.javaClass.simpleName)
    }
    override fun getDailyWorkout(): String {
        return " Swim 1000 meters as a warm up"
    }
}