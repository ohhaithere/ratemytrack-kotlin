package com.mrazi.ratemytrack.dto

import java.time.LocalDateTime
import java.util.*

data class RatingDto(val id: UUID,
                     val userId: UUID,
                     val trackId: UUID,
                     val rate: Int,
                     val created: LocalDateTime,
                     val updated: LocalDateTime)