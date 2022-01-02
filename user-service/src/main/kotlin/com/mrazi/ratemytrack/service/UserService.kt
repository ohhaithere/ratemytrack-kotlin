package com.mrazi.ratemytrack.service

import com.mrazi.ratemytrack.dto.UserDto
import com.mrazi.ratemytrack.mapper.UserMapper
import com.mrazi.ratemytrack.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class UserService(private var userRepository: UserRepository, private var mapper: UserMapper) {

    fun save(dto: UserDto): UserDto {
        val user = mapper.convertToModel(dto);
        userRepository.save(user);
        return mapper.convertToDto(user);
    }

}