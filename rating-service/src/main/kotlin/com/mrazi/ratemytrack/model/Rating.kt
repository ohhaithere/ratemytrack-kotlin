package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Id

data class Rating(@Id val id: UUID,
                  val userId: UUID,
                  val trackId: UUID,
                  val rate: Int,
                  val created: LocalDateTime,
                  val updated: LocalDateTime)
