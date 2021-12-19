package com.mrazi.ratemytrack.repository

import com.mrazi.ratemytrack.model.Track
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TrackRepository : JpaRepository<Track, UUID> {
}