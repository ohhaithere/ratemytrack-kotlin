package com.mrazi.ratemytrack.controller

import com.mrazi.ratemytrack.dto.UserDto
import com.mrazi.ratemytrack.service.UserService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {

    @PostMapping
    fun save(@RequestBody dto: UserDto): UserDto {
        return userService.save(dto);
    }


    fun get(id: UUID): UserDto {
        return userService.get(id);
    }

    @GetMapping
    fun get(): List<UserDto> {
        return userService.get();
    }

}