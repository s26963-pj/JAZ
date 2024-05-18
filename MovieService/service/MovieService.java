package pl.robmic.MovieService.service;

import org.springframework.stereotype.Service;
import pl.robmic.MovieService.exeptions.MovieNotFoundException;
import pl.robmic.MovieService.exeptions.MovieWrongDataException;
import pl.robmic.MovieService.model.Movie;
import pl.robmic.MovieService.repository.MovieRepository;

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


}
