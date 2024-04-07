package pl.pjatk.matszo.zjazd1;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from 2nd component");
        myFirstComponent.printHello();
    }

    public void printHello(){
        System.out.println("Hello from MySecondComponent - printHello");
    }
}
