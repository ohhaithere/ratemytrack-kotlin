package com.mrazi.ratemytrack.mapper

import com.mrazi.ratemytrack.dto.TrackDto
import com.mrazi.ratemytrack.model.Track
import org.mapstruct.*
import java.time.LocalDateTime
import java.util.*


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface TrackMapper {

    fun convertToDto(track: Track): TrackDto
    @InheritInverseConfiguration
    fun convertToModel(dto: TrackDto): Track

}