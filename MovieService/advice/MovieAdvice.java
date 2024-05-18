package pl.robmic.MovieService.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.robmic.MovieService.exeptions.MovieNotFoundException;
import pl.robmic.MovieService.exeptions.MovieWrongDataException;

@RestControllerAdvice
public class MovieAdvice extends RuntimeException {

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<String> handleMovieNotFoundException(MovieNotFoundException ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Exception occured on request.Exception message: " + ex.getLocalizedMessage());
    }

    @ExceptionHandler(MovieWrongDataException.class)
    public ResponseEntity<String> handleMovieWrongDataException(MovieWrongDataException ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Exception occured on request.Exception message: " + ex.getLocalizedMessage());
    }

}
