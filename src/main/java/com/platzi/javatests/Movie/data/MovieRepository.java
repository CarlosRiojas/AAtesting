package com.platzi.javatests.Movie.data;

import com.platzi.javatests.Movie.model.Movie;

import java.util.Collection;

public interface MovieRepository {

     Movie findById(long id);
     Collection<Movie> findAll();
     void saveOrUpdate(Movie movie);

}
