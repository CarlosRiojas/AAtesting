package com.platzi.javatests.Movie.service;

import com.platzi.javatests.Movie.data.MovieRepository;
import com.platzi.javatests.Movie.model.Genre;
import com.platzi.javatests.Movie.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieServiceShould {


   private  MovieService movieService;

    @Before
     void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );


        movieService = new MovieService(movieRepository);

    }

    @Test
    public void return_movies_by_genre() {


        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        Assert.assertThat(movies, CoreMatchers.is(Arrays.asList(3,6)));

    }
    @Test
    public void return_movies_length(){
        Collection<Movie> movies =  movieService.findMoviesByLength(119);
        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());//no se va  refactorizar

        Assert.assertThat(movieIds, CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
    }
}