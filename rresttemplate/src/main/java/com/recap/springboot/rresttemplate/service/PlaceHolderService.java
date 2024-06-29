package com.recap.springboot.rresttemplate.service;

import com.recap.springboot.rresttemplate.dto.Post;
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

    public List<Post> getAllPostList() {
        HttpEntity<?> entity = getStringHttpEntity(null);
        return restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/posts", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Post>>(){}).getBody();
    }

    public Post createPost(Post post) {
        HttpEntity<?> entity = getStringHttpEntity(post);

        return restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, entity, Post.class).getBody();
    }

    private HttpEntity<?> getStringHttpEntity(Post post) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        return post == null ? new HttpEntity<>(headers) :  new HttpEntity<>(post, headers);
    }
}
