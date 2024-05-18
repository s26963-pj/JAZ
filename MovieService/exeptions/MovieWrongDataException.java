package pl.robmic.MovieService.exeptions;

public class MovieWrongDataException extends RuntimeException{
    public MovieWrongDataException(String message){
        super(message);
    }
}
