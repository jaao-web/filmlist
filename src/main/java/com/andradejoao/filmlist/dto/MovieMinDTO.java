package com.andradejoao.filmlist.dto;

import com.andradejoao.filmlist.entities.Movie;
import com.andradejoao.filmlist.projections.MovieMinProjection;

public class MovieMinDTO {

    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;


    public MovieMinDTO() {
    }

    public MovieMinDTO(Movie entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public MovieMinDTO(MovieMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getMovieYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

}
