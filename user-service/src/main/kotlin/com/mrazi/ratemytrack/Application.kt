package com.mrazi.ratemytrack

import com.mrazi.ratemytrack.client.AuthClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients(clients = [AuthClient::class])
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
