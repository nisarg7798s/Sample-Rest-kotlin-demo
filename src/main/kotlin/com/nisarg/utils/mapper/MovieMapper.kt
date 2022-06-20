package com.nisarg.utils.mapper

import com.nisarg.dto.MovieDto
import com.nisarg.entity.Movie
import org.springframework.stereotype.Service

@Service
class MovieMapper : Mapper<MovieDto, Movie> {
    override fun fromEntity(entity: Movie): MovieDto {
        return MovieDto(
                entity.id,
                entity.name,
                entity.rating
        )
    }

    override fun toEntity(domain: MovieDto): Movie = Movie(
            domain.id,
            domain.name,
            domain.rating
    )
}