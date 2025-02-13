package com.andradejoao.filmlist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;


    public Belonging() {
    }

    public Belonging(Movie movie, MovieList list, Integer position) {
        id.setMovie(movie);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return this.id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if(o == null)
            return false;
        if (getClass() != o.getClass()) {
            return false;
        }
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
