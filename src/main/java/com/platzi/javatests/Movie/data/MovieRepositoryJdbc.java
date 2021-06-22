package com.platzi.javatests.Movie.data;

import com.platzi.javatests.Movie.model.Genre;
import com.platzi.javatests.Movie.model.Movie;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {


        return jdbcTemplate.query("select * from movies", movieMapper);




    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static RowMapper<Movie> movieMapper = new RowMapper() {
        @Override
        public Movie MapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Movie(rs.getInt("id"),
                    rs.getInt("name"),
                    rs.getInt("minutes"),
                    rs.getString("genre");
            Genre.valueOf(rs.getString("genre")));
        }
    };
}
