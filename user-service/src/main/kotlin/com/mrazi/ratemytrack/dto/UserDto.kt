package com.mrazi.ratemytrack.dto

import java.util.*

data class UserDto(val id: UUID?,
                   val name: String,
                   val role: String,
                   val email: String,
                   val password: String)
