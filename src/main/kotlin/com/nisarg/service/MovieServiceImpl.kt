package com.nisarg.service

import com.nisarg.dto.MovieDto
import com.nisarg.repository.MovieRepository
import com.nisarg.utils.mapper.MovieMapper
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {

    override fun createMovie(movieDto: MovieDto) : MovieDto {

        if(movieDto.id != -1)
            throw IllegalArgumentException("Id must be null of -1");

        val movie = movieMapper.toEntity(movieDto)
        movieRepository.save(movie);
        return movieMapper.fromEntity(movie)
    }
}