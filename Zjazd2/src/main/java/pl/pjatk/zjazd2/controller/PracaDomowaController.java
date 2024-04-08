package pl.pjatk.zjazd2.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.zjazd2.model.Car;

@RestController
@RequestMapping("/homework")
public class PracaDomowaController {

    @GetMapping("/getMethod")
    ResponseEntity<String> getMethod(@RequestParam String value) {
        return ResponseEntity.ok(value);
    }
    @GetMapping("/getMethod/{value}")
    ResponseEntity<Integer> getMethod(@PathVariable Integer value) {
        return ResponseEntity.ok(value);
    }
    @PutMapping("/putMethod")
    ResponseEntity<Car> putMethod(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
    @PutMapping("/putMethod/{value}")
    ResponseEntity<Integer> putMethod(@PathVariable Integer value) {
        return ResponseEntity.ok(value);
    }
    @PostMapping("/postMethod")
    ResponseEntity<Car> postMethod(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
    @DeleteMapping("/deleteMethod/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMethod(@PathVariable Integer id) {

    }
}
