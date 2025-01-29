package com.andradejoao.filmlist.dto;

public class MovieListDTO {

	private Long id;
	private String name;

    public MovieListDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
