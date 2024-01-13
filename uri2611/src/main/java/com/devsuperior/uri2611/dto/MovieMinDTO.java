package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projections.MovieMinProjection;

public class MovieMinDTO {
    private Long id;
    private String name;

    public MovieMinDTO(MovieMinProjection movie) {
        id = movie.getId();
        name = movie.getName();
    }


    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " - " + name;
    }
}
