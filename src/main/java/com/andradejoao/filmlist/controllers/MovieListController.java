package com.andradejoao.filmlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andradejoao.filmlist.dto.MovieListDTO;
import com.andradejoao.filmlist.dto.MovieMinDTO;
import com.andradejoao.filmlist.services.MovieListService;
import com.andradejoao.filmlist.services.MovieService;

@RestController
@RequestMapping(value = "/lists")
public class MovieListController {

    @Autowired
    private MovieListService movieListService;

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieListDTO> findAll() {
        return movieListService.findAll();
    }

    @GetMapping(value = "/{listId}/movies")
    public List<MovieMinDTO> findByList(@PathVariable Long listId) {
        var result = movieService.findByList(listId);
        return result;
    }
}
