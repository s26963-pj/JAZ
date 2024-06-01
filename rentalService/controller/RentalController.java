package pl.pjatk.rentalService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.rentalService.model.Movie;
import pl.pjatk.rentalService.service.RentalService;

@RestController
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/get/movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id){
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/put/isavailable/{id}")
    public ResponseEntity<Void> changeIsAvailable(@PathVariable Long id){
        rentalService.changeIsAvailable(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PutMapping("/put/rent/{id}")
    public ResponseEntity<Void> rentMovie(@PathVariable Long id){
        rentalService.rentMovie(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
