package com.nisarg.web.rest

import com.nisarg.dto.MovieDto
import com.nisarg.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping
    fun createMovie(@RequestBody movieDto: MovieDto): ResponseEntity<MovieDto> {
        return ResponseEntity(movieService.createMovie(movieDto), HttpStatus.CREATED)
    }
}