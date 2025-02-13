package com.andradejoao.filmlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andradejoao.filmlist.entities.MovieList;

public interface MovieListRepository extends JpaRepository<MovieList, Long>{}
