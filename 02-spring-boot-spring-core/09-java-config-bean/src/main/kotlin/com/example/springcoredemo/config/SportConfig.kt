package com.example.springcoredemo.config

import com.example.springcoredemo.common.Coach
import com.example.springcoredemo.common.SwimCoach
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SportConfig {
    @Bean("aquatic")
    fun swimCoach(): Coach = SwimCoach()
}