package com.mrazi.ratemytrack.dto

import org.springframework.web.multipart.MultipartFile
import java.util.*

data class TrackDto(var id: UUID? = null, var name: String, var length: Integer, var userId: UUID, var file: MultipartFile?)
