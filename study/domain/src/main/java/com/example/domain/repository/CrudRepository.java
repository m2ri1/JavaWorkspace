package com.example.domain.repository;


import com.example.domain.entity.CrudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<CrudEntity, Integer> {

}
