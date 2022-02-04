package com.mrazi.ratemytrack.repository

import com.mrazi.ratemytrack.model.Rating
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RatingRepository: JpaRepository<Rating, UUID> {
}