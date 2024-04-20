package pl.pjatk.zjazd3application;

import org.springframework.stereotype.Component;

@Component
public class ExampleService {

    public ExampleService(ExampleClass exampleClass) {
        System.out.println(exampleClass.toString());
    }
}
