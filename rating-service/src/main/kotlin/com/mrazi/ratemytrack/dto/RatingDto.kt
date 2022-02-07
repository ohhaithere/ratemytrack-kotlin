package com.mrazi.ratemytrack.dto

import java.time.LocalDateTime
import java.util.*

data class RatingDto(var id: UUID?,
                     val userId: UUID,
                     val trackId: UUID,
                     val rate: Int,
                     var created: LocalDateTime?,
                     var updated: LocalDateTime?)