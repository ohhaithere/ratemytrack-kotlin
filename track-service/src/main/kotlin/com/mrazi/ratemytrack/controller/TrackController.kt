package com.mrazi.ratemytrack.controller

import com.mrazi.ratemytrack.dto.TrackDto
import com.mrazi.ratemytrack.service.TrackService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/track")
class TrackController(val service:TrackService) {

    @PostMapping
    fun upload(@RequestBody track: TrackDto){
     service.upload(track);
    }

}