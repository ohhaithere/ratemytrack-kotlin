package com.mrazi.ratemytrack.service

import com.mrazi.ratemytrack.dto.RatingDto
import com.mrazi.ratemytrack.mapper.RatingMapper
import com.mrazi.ratemytrack.repository.RatingRepository
import org.springframework.stereotype.Component

@Component
class RatingService(private var ratingRepository: RatingRepository, private var mapper: RatingMapper) {

    fun save(dto: RatingDto): RatingDto {
        val rate = mapper.convertToModel(dto);
        ratingRepository.save(rate);
        return mapper.convertToDto(rate);
    }

}