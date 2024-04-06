package pl.pjatk.zjazd2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.zjazd2.model.Car;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    ResponseEntity<String> printHello(){
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/model")
    ResponseEntity<Car> printCar(){
        return ResponseEntity.ok(new Car("Porsche", "911", 899900.5));
    }
    @GetMapping("/hello/{someValue}")
    ResponseEntity<String> printSomeValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/param")
    ResponseEntity<String> printSomeValueReqParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }
    @PostMapping("/create")
    ResponseEntity<Car> returnCar(@RequestBody Car car){
        return  ResponseEntity.ok(car);
    }
}
