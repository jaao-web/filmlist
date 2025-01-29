package com.andradejoao.filmlist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private MovieList list;


    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieList getList() {
        return this.list;
    }

    public void setList(MovieList list) {
        this.list = list;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BelongingPK)) {
            return false;
        }
        BelongingPK belongingPK = (BelongingPK) o;
        return Objects.equals(movie, belongingPK.movie) && Objects.equals(list, belongingPK.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, list);
    }    
}
