package com.example.springcoredemo.common

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
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