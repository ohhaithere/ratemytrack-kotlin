package com.mrazi.ratemytrack.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "rating", schema = "public")
data class Rating(@Id var id: UUID?,
                  val userId: UUID,
                  val trackId: UUID,
                  val rate: Int,
                  var created: LocalDateTime?,
                  var updated: LocalDateTime?)
