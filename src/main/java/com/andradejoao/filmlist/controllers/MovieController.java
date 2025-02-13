package com.andradejoao.filmlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andradejoao.filmlist.dto.MovieMinDTO;
import com.andradejoao.filmlist.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieMinDTO> findAll() {
        return movieService.findAll();
    }
}
