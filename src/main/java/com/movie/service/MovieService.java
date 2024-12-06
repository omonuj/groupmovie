package com.movie.service;

import com.movie.data.model.Movie;

import java.util.List;

public interface MovieService {


    void updateMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> getMovieByTitle(String title);
    List<Movie> getMoviesByGenre(String genre);
    List<Movie> getMoviesByYear(int year);
    void AllMovies();
    void SingleMovie(String title);


}
