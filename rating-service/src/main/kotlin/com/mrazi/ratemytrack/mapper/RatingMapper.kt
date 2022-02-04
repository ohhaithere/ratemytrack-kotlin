package com.mrazi.ratemytrack.mapper

import com.mrazi.ratemytrack.dto.RatingDto
import com.mrazi.ratemytrack.model.Rating
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface RatingMapper {

    fun convertToDto(rating: Rating): RatingDto
    @InheritInverseConfiguration
    fun convertToModel(user: RatingDto): Rating

}