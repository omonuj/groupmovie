//package com.movie.controller;
//
//import com.movie.service.MovieService;
//import com.movie.service.MovieServiceImpl;
//import com.movie.data.model.Movie;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping
//public class MovieController {
//
//    @Autowired
//    private MovieService movieServiceImpl;
//
//
//    @GetMapping
//    public ResponseEntity<List<Movie>> allMovies() {
//        return new ResponseEntity<List<Movie>>(movieServiceImpl.AllMovies(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id) {
//        return new ResponseEntity<Optional<Movie>>(movieServiceImpl.singleMovie(id), HttpStatus.OK);
//
//    }
//}
