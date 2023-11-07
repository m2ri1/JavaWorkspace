package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CrudRepository extends JpaRepository<CrudEntity, Integer> {
}
