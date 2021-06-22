package com.platzi.javatests.Movie.service;

import com.platzi.javatests.Movie.data.MovieRepository;
import com.platzi.javatests.Movie.model.Genre;
import com.platzi.javatests.Movie.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {


    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


 public  Collection<Movie> findMoviesByGenre(Genre genre){

       Collection<Movie> allMovies= movieRepository.findAll().stream()
               .filter(movie -> movie.getGenre()== genre).collect(Collectors.toList());
       return allMovies;
 }

    public Collection<Movie> findMoviesByLength(int length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes()<= length).collect(Collectors.toList());
    }
}
