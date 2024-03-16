package pl.pjatk.matszo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {
    public MyFirstComponent() {
        System.out.println("Hello from 1st component");
    }
    public void printHello(){
        System.out.println("Hello from MyFirstComponent from method printHelloMessage");
    }
}
