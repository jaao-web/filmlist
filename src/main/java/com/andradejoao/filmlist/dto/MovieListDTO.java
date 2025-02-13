package com.andradejoao.filmlist.dto;

import com.andradejoao.filmlist.entities.MovieList;

public class MovieListDTO {

    private Long id;
    private String name;


    public MovieListDTO() {
    }

    public MovieListDTO(MovieList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
}
