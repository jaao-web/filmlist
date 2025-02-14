package com.andradejoao.filmlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andradejoao.filmlist.dto.MovieDTO;
import com.andradejoao.filmlist.dto.MovieMinDTO;
import com.andradejoao.filmlist.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/{id}")
    public MovieDTO findAll(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @GetMapping
    public List<MovieMinDTO> findAll() {
        return movieService.findAll();
    }
}
