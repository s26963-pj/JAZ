package pl.pjatk.movieService.exeptions;

public class MovieWrongDataException extends RuntimeException{
    public MovieWrongDataException(String message){
        super(message);
    }
}
