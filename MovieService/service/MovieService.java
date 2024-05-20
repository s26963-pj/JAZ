package com.example.movieservice.service;

import com.example.movieservice.exeptions.MovieWrongDataException;
import com.example.movieservice.model.Movie;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;
import com.example.movieservice.exeptions.*;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isEmpty()){
            throw new MovieNotFoundException("Movie with that id has not been found");
        }
        else{
            return movie.get();
        }
    }

    public Movie addMovie(Movie movie){
        if(movie.getName() == null || movie.getCategory() == null){
            throw new MovieWrongDataException("Wrong data inserted");
        } else {
            movie.setIs_available(false);
            movieRepository.save(movie);
            return movie;
        }
    }

    public void updateMovie(Long id, Movie movie){
        if (movie.getName() == null || movie.getCategory() == null){
            throw new MovieNotFoundException("Movie with that id has not been found");
        }
        Optional<Movie> movieFromDb = movieRepository.findById(id);
        if (movieFromDb.isPresent()){
            Movie movie1 = movieFromDb.get();
            movie1.setName(movie.getName());
            movie1.setCategory(movie.getCategory());
            movieRepository.save(movie1);
        }
    }

    public void deleteMovieById(Long id){
        movieRepository.deleteById(id);
    }

    public void changeIsAvailable(Long id){
        Optional<Movie> movieFromDb = movieRepository.findById(id);
        if (movieFromDb.isEmpty()){
            throw new MovieNotFoundException("There is no movie with that id");
        }else{
            Movie movie = movieFromDb.get();
            movie.setIs_available(true);
            movieRepository.save(movie);
        }
    }


}
