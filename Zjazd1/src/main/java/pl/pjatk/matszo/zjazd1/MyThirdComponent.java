package pl.pjatk.matszo.zjazd1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext) {
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);

        myFirstComponent.printHello();
        mySecondComponent.printHello();
    }
}
