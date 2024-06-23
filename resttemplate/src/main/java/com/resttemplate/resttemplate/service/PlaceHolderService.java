package com.resttemplate.resttemplate.service;

import com.resttemplate.resttemplate.dto.Todo;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlaceHolderService {

    @Autowired
    private RestTemplate restTemplate;

   /* public PlaceHolderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }*/

    public Todo getData(Long id) {
        HttpEntity<String> entity = getStringHttpEntity();

        Todo response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos/"+id, HttpMethod.GET, entity, Todo.class).getBody();

        System.out.println(response);
        return response;
    }

    public List<Todo> getDataList() {
        HttpEntity<String> entity = getStringHttpEntity();

        List<Todo> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos/", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Todo>>(){}).getBody();

        System.out.println(response);
        return response;
    }

    private HttpEntity<String> getStringHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return entity;
    }
}
