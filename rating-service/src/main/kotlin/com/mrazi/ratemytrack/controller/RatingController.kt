package com.mrazi.ratemytrack.controller

import com.mrazi.ratemytrack.dto.RatingDto
import com.mrazi.ratemytrack.service.RatingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rate")
class RatingController(private var ratingService: RatingService) {

    @PostMapping
    fun save(@RequestBody rate: RatingDto){
        ratingService.save(rate);
    }

}