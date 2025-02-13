package com.andradejoao.filmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andradejoao.filmlist.dto.MovieListDTO;
import com.andradejoao.filmlist.repositories.MovieListRepository;

@Service
public class MovieListService {

    @Autowired
    private MovieListRepository movieListRepository;

    @Transactional(readOnly = true)
    public List<MovieListDTO> findAll(){
        var allmovies = movieListRepository.findAll();
        return allmovies.stream().map(x -> new MovieListDTO(x)).toList();
    }
}
