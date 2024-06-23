package com.resttemplate.resttemplate.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Todo {

    private Long userId;

    private Long id;

    private String title;

    private boolean completed;
}