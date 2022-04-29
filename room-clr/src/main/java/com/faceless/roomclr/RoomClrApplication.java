package com.faceless.roomclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class RoomClrApplication {

    private static final Logger LOG = LoggerFactory.getLogger(RoomClrApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            LOG.info("Start CLR application");
            ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
                    });
            rooms.getBody().forEach(room -> {
                LOG.info(room.toString());
            });
            LOG.info("Finish CLR application");
        };
    }

    @Bean
    public CommandLineRunner fizzBuzz(){
        return args -> {
            for (int i = 0; i < 101; i++) {
                if(i % 3==0 && i % 5 ==0) {
                    LOG.info("FizzBuzz");
                } else if (i % 3 == 0) {
                    LOG.info("Fizz");
                } else if (i % 5 ==0){
                    LOG.info("Buzz");
                } else {
                    LOG.info(String.valueOf(i));
                }
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomClrApplication.class, args);
    }

}
