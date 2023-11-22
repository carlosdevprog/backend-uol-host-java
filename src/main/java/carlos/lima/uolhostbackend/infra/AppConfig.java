package carlos.lima.uolhostbackend.infra;

import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
