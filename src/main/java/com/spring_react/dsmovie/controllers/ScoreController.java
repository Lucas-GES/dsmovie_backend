package com.spring_react.dsmovie.controllers;

import com.spring_react.dsmovie.dto.MovieDTO;
import com.spring_react.dsmovie.dto.ScoreDTO;
import com.spring_react.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = service.saveScore(dto);
        return  movieDTO;
    }


}
