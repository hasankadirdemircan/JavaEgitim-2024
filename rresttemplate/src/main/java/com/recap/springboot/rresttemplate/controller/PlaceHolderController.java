package com.recap.springboot.rresttemplate.controller;

import com.recap.springboot.rresttemplate.dto.Post;
import com.recap.springboot.rresttemplate.service.PlaceHolderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
public class PlaceHolderController {

    @Autowired
    private PlaceHolderService placeHolderService;

    @GetMapping("/post")
    public List<Post> getAllPostList() {
        return placeHolderService.getAllPostList();
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return placeHolderService.createPost(post);
    }

    @GetMapping("/post/{postId}")
    public Post getPostById(@PathVariable("postId") Long postId) {
        return placeHolderService.getPostById(postId);
    }

}
