package com.mrazi.ratemytrack.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration

class WebConfig {

    @Value("\${cors.originPatterns:default}")
    private val corsOriginPatterns: String = ""


}