package com.resttemplate.resttemplate.controller;

import com.resttemplate.resttemplate.dto.Todo;
import com.resttemplate.resttemplate.service.PlaceHolderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
public class PlaceHolderController {

    @Autowired
    private PlaceHolderService placeHolderService;

    @GetMapping("/{id}")
    public Todo getData(@PathVariable("id") Long id) {
        return placeHolderService.getData(id);
    }

    @GetMapping
    public List<Todo> getData() {
        return placeHolderService.getDataList();
    }
}
