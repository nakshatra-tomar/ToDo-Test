package com.example.ToDo.controller;


import com.example.ToDo.model.ToDo;
import com.example.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Marks this class as a REST controller
@RequestMapping("/api/todos") // Maps HTTP requests to /api/todos to this controller
public class ToDoController {

    @Autowired // Injects an instance of ToDoService
    private ToDoService toDoService;

    // Handles GET requests to /api/todos
    @GetMapping
    public List<ToDo> getAllToDos() {
        return toDoService.getAllToDos();
    }

    // Handles GET requests to /api/todos/{id}
    @GetMapping("/{id}")
    public Optional<ToDo> getToDoById(@PathVariable Long id) {
        return toDoService.getToDoById(id);
    }

    // Handles POST requests to /api/todos
    @PostMapping
    public ToDo createToDo(@RequestBody ToDo toDo) {
        return toDoService.saveToDo(toDo);
    }

    // Handles PUT requests to /api/todos/{id}
    @PutMapping("/{id}")
    public ToDo updateToDo(@PathVariable Long id, @RequestBody ToDo toDoDetails) {
        ToDo toDo = toDoService.getToDoById(id).orElseThrow(() -> new RuntimeException("ToDo not found"));
        toDo.setTitle(toDoDetails.getTitle());
        toDo.setCompleted(toDoDetails.isCompleted());
        return toDoService.saveToDo(toDo);
    }

    // Handles DELETE requests to /api/todos/{id}
    @DeleteMapping("/{id}")
    public void deleteToDoById(@PathVariable Long id) {
        toDoService.deleteToDoById(id);
    }
}

