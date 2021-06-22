package com.platzi.javatests.Movie.data;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import javax.sql.DataSource;
import java.util.Arrays;

import static org.junit.Assert.assertThat;

public class MovieRepositoryJdbcIntegrationTestTest {
    @Test
    public void load_all_movies() {
      DataSource dataSource =  new DriverManagerDataSource("jdbc:h2:mem:test;MODE = MYSQL", "sa","sa");

      ScriptUtils.excuteSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new jdbcTemplate(dataSource);
      MovieRepository movieRepository =  new MovieRepositoryJdbc(jdbcTemplate);

      movieRepository.findAll();

      assertThat(movies, CoreMatchers.is(Arrays.asList(
            //lista de peliculas que no tengo.


      )));
    }
}