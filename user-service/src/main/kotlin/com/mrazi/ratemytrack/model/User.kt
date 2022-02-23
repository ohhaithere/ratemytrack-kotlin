package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user", schema = "public")
class User(
    @Id var id: UUID? = null,
    val name: String,
    val role: String,
    val email: String,
    val password: String,
    var joined: LocalDateTime? = null
)
