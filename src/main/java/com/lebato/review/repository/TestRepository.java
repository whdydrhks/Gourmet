package com.lebato.review.repository;

import com.lebato.review.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, Long>, TestRepositoryCustom {
    // JPA를 사용한 방법
    public List<TestEntity> findAllByName(String name);
}
