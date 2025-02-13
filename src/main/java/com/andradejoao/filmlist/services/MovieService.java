package com.andradejoao.filmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andradejoao.filmlist.dto.MovieDTO;
import com.andradejoao.filmlist.dto.MovieMinDTO;
import com.andradejoao.filmlist.entities.Movie;
import com.andradejoao.filmlist.projections.MovieMinProjection;
import com.andradejoao.filmlist.repositories.MovieRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie result = movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Movie not found"));
        return new MovieDTO(result);
    }

    @Transactional(readOnly = true)
    public List<MovieMinDTO> findAll(){
        var allmovies = movieRepository.findAll();
        return allmovies.stream().map(x -> new MovieMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<MovieMinDTO> findByList(Long listId){
        var allmovies = movieRepository.searchByList(listId);
        return allmovies.stream().map(x -> new MovieMinDTO(x)).toList();
    }
}
