package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
    @Id val id: UUID,
    val name: String,
    val role: String,
    val email: String,
    val password: String,
    val joined: LocalDateTime
    )