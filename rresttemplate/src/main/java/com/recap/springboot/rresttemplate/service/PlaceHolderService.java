package com.recap.springboot.rresttemplate.service;

import com.recap.springboot.rresttemplate.dto.Post;
import com.recap.springboot.rresttemplate.exception.DefaultExceptionHandler;
import com.recap.springboot.rresttemplate.exception.PostNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PlaceHolderService {

    private static final String PLACE_HOLDER_ALL_URI = "https://jsnplaceholder.typicode.com/posts";
    private static final String SLASH = "/";

    @Autowired
    private RestTemplate restTemplate;

    public List<Post> getAllPostList() {
        HttpEntity<?> entity = getStringHttpEntity(null);
        log.info("fetching all post list");
        List<Post> postList = new ArrayList<>();
        try {
            postList = restTemplate.exchange(
                    PLACE_HOLDER_ALL_URI , HttpMethod.GET, entity, new ParameterizedTypeReference<List<Post>>(){}).getBody();
        }catch (Exception e) {
            log.error("fetching all post failed for {} URI , Exception {}", PLACE_HOLDER_ALL_URI, e.getMessage());
            throw new DefaultExceptionHandler("something went wrong while fetching all posts, please try it again");
        }
        return postList;
    }

    public Post createPost(Post post) {
        log.info("creating post body = {}", post);
        HttpEntity<?> entity = getStringHttpEntity(post);
        Post createdPost = null;
        try{
            createdPost = restTemplate.exchange(
                     PLACE_HOLDER_ALL_URI, HttpMethod.POST, entity, Post.class).getBody();
        }catch (Exception e) {
            log.error("creating post failed for {} URI , body {}", PLACE_HOLDER_ALL_URI, post);
        }
        return createdPost;
    }

    public Post getPostById(Long postId) {
        log.info("fetching post for id = {}", postId);
        HttpEntity<?> entity = getStringHttpEntity(null);
        Post post = null;
        String postIdURI = PLACE_HOLDER_ALL_URI + SLASH + postId;
        try{
            post = restTemplate.exchange(
                    postIdURI, HttpMethod.GET, entity, Post.class).getBody();
        }catch (Exception e) {
            log.error("fetching post for {} URI , id = {}", postIdURI, postId);
        }

        if (Objects.isNull(post) || ObjectUtils.isEmpty(post)) {
            throw new PostNotFoundException("Post Not Found For " + postId);
        }
        return post;
    }

    private HttpEntity<?> getStringHttpEntity(Post post) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        return post == null ? new HttpEntity<>(headers) :  new HttpEntity<>(post, headers);
    }
}
