package com.example.ToDo.repository;


import com.example.ToDo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicates that this is a Spring Data repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    // No need to add any methods, JpaRepository provides CRUD operations
}

