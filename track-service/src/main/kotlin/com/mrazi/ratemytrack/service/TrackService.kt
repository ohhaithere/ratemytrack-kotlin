package com.mrazi.ratemytrack.service

import com.mrazi.ratemytrack.dto.TrackDto
import com.mrazi.ratemytrack.mapper.TrackMapper
import com.mrazi.ratemytrack.repository.TrackRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Component
class TrackService(private var trackRepository: TrackRepository, private var mapper: TrackMapper) {

    fun upload(dto: TrackDto): TrackDto {
        val track = mapper.convertToModel(dto);
        trackRepository.save(track);
        return mapper.convertToDto(track);
    }

    fun update(dto: TrackDto): TrackDto {
        val track = trackRepository.getById(dto.id);
        return mapper.convertToDto(track);
    }

}