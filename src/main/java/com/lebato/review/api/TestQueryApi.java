package com.lebato.review.api;

import com.lebato.review.model.TestEntity;
import com.lebato.review.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;

    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa() {
        return testService.findAllByNameByJPA("lebato");
    }
    /*
    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa(@RequestParam("name") String name) {
        return testService.findAllByNameByJPA(name);
    }
     */

    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl() {
        return testService.findAllByNameByQuerydsl("lebato");
    }
}
