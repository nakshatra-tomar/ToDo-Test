package com.example.ToDo.model;

import jakarta.persistence.Entity;// Imports the Entity annotation to mark this class as an entity
import jakarta.persistence.GeneratedValue;// Imports the GeneratedValue annotation for auto-generating primary key values
import jakarta.persistence.GenerationType;// Imports the GenerationType enumeration for specifying generation strategies
import jakarta.persistence.Id;// Imports the Id annotation to mark the primary key field

@Entity // Marks this class as a JPA entity
public class ToDo {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the primary key value will be automatically generated
    private Long id; // The unique identifier for each To-Do item

    private String title; // The title or description of the To-Do item

    private boolean completed; // A boolean flag indicating whether the To-Do item is completed

    // Getters and Setters for the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

