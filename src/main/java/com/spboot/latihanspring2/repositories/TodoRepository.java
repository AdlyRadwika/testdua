package com.spboot.latihanspring2.repositories;


import com.spboot.latihanspring2.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}