package com.resttemplate.resttemplate.config;

import com.resttemplate.resttemplate.service.PlaceHolderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PlaceHolderConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

   /* @Bean
    public PlaceHolderService placeHolderService(RestTemplate restTemplate) {
        return new PlaceHolderService(restTemplate);
    }*/
}
