package pl.pjatk.matszo;

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
    public List<String> defaultData(){
        return List.of("test1", "test2", "test3", "test4", "test5");
    }

}
