package pl.pjatk.rentalService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalService.model.Movie;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id){
        return restTemplate.getForObject("http://localhost:8080/movies/" + id, Movie.class);
    }

    public void changeIsAvailable(Long id){
        restTemplate.getForEntity("http://localhost:8080/movies/isavailable/" + id, Void.class);
    }

    public void rentMovie(Long id){
        restTemplate.getForEntity("http://localhost:8080/movies/rent/" + id, Void.class);
    }
}
