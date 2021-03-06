package com.platzi.javatests.Movie.model;

public class Movie {
    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(int id, String name, int minutes, String string, Genre genre){
        this(null, name,minutes,genre);//llama al segundo constructor cuando no se llama al id se llama al id Null
    }


    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public Genre getGenre() {
        return genre;
    }
}
