package com.andradejoao.filmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andradejoao.filmlist.dto.MovieMinDTO;
import com.andradejoao.filmlist.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieMinDTO> findAll(){
        var allmovies = movieRepository.findAll();
        return allmovies.stream().map(x -> new MovieMinDTO(x)).toList();
    }
}
