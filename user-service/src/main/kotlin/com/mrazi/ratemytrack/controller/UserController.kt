package com.mrazi.ratemytrack.controller

import com.mrazi.ratemytrack.dto.UserDto
import com.mrazi.ratemytrack.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/track")
class UserController(val service: UserService) {

    @PostMapping
    fun save(@RequestBody user: UserDto){
        service.save(user);
    }

}