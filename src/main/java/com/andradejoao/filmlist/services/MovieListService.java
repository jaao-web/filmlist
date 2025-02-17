package com.andradejoao.filmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andradejoao.filmlist.dto.MovieListDTO;
import com.andradejoao.filmlist.projections.MovieMinProjection;
import com.andradejoao.filmlist.repositories.MovieListRepository;
import com.andradejoao.filmlist.repositories.MovieRepository;

@Service
public class MovieListService {

    @Autowired
    private MovieListRepository movieListRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public List<MovieListDTO> findAll() {
        var allmovies = movieListRepository.findAll();
        return allmovies.stream().map(x -> new MovieListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int souceIndex, int destinationIndex) {

        List<MovieMinProjection> list = movieRepository.searchByList(listId);
        
        MovieMinProjection obj = list.remove(souceIndex);
        list.add(destinationIndex, obj);

        int min = souceIndex < destinationIndex ? souceIndex : destinationIndex;
        int max = souceIndex < destinationIndex ? destinationIndex : souceIndex;

        for (int i = min; i <= max; i++) {
            movieListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
