package tech.claudioed.springboot.temporalio.infra.rest;

import java.time.temporal.Temporal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateProducer {
  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

}
