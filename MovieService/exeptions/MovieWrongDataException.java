package com.example.movieservice.exeptions;

public class MovieWrongDataException extends RuntimeException{
    public MovieWrongDataException(String message){
        super(message);
    }
}
