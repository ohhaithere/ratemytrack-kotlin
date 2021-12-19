package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Track(
    @Id val id: UUID,
    val name: String,
    val length: Integer,
    val userId: UUID,
    val uploadDate: LocalDateTime,
    val updateDate: LocalDateTime)