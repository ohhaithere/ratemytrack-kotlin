package com.mrazi.ratemytrack.mapper

import com.mrazi.ratemytrack.dto.UserDto
import com.mrazi.ratemytrack.model.User
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface UserMapper {

    fun convertToDto(user: User): UserDto
    @InheritInverseConfiguration
    fun convertToModel(user: UserDto): User

    fun convertUsersToDtos(users: List<User>): List<UserDto> {
        return users.map { t -> convertToDto(t) }
    }

}