package com.andradejoao.filmlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andradejoao.filmlist.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{}
