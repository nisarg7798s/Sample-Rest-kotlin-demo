package com.nisarg.service

import com.nisarg.dto.MovieDto

interface MovieService {

    fun createMovie(movieDto: MovieDto): MovieDto
}