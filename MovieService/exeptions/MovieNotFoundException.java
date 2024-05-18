package pl.robmic.MovieService.exeptions;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(String message){
        super(message);
    }
}
