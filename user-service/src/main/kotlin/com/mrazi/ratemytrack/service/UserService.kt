package com.mrazi.ratemytrack.service

import com.mrazi.ratemytrack.client.AuthClient
import com.mrazi.ratemytrack.dto.UserDto
import com.mrazi.ratemytrack.mapper.UserMapper
import com.mrazi.ratemytrack.repository.UserRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

@Component
class UserService(private var userRepository: UserRepository,
                  private var mapper: UserMapper,
                  private var authClient: AuthClient) {

    fun save(dto: UserDto): UserDto {
        val user = mapper.convertToModel(dto);
        user.id = UUID.randomUUID()
        user.joined = LocalDateTime.now()
        userRepository.save(user);
        authClient.createUser(dto);
        return mapper.convertToDto(user);
    }

    fun update(dto: UserDto): UserDto {
        val user = mapper.convertToModel(dto);
        userRepository.save(user);
        return mapper.convertToDto(user);
    }

    fun get(id: UUID): UserDto {
        return mapper.convertToDto(userRepository.getById(id));
    }

    fun get(): List<UserDto> {
        return mapper.convertUsersToDtos(userRepository.findAll());
    }

}