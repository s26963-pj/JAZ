package pl.pjatk.rentalService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RentalConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
