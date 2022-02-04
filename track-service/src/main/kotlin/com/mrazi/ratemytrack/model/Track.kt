package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "track", schema = "public")
data class Track(
    @Id var id: UUID?,
    val name: String,
    val length: Int?,
    val userId: UUID,
    var uploadDate: LocalDateTime?,
    var updateDate: LocalDateTime?)