package com.lebato.review.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/hello/world")
    public String helloWorld() {
        return "[Get] Hello World!";
    }
}
