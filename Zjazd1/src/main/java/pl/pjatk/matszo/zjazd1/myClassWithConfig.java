package pl.pjatk.matszo.zjazd1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Configuration
public class myClassWithConfig {

    @Bean
    public MyPOJO myPOJO(){
        return new MyPOJO("text1", "text2", 1);
    }

    @Bean
    public List<String> defaultData(@Value("${my.custom.property: jakas wartosc}") String valueFromProperties){
        System.out.println(valueFromProperties);
        return List.of("test1", "test2", "test3", "test4", "test5");
    }

}
