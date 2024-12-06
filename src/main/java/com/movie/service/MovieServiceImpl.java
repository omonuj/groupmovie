package com.movie.service;

import com.movie.data.model.Movie;
import com.movie.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public List<Movie> getMovieByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return List.of();
    }

    @Override
    public List<Movie> getMoviesByYear(int year) {
        return List.of();
    }

    @Override
    public void AllMovies() {

    }

    @Override
    public void SingleMovie(String title) {

    }
}
