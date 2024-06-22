package service;

import model.ToDo;
import com.example.ToDo_Test.ToDoTestApplication;
import repository.ToDoRepository;
import service.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marks this class as a Spring service
public class ToDoService {

    @Autowired // Injects an instance of ToDoRepository
    private ToDoRepository toDoRepository;

    // Retrieves all ToDo items
    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    // Retrieves a ToDo item by its ID
    public Optional<ToDo> getToDoById(Long id) {
        return toDoRepository.findById(id);
    }

    // Saves a new or existing ToDo item
    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    // Deletes a ToDo item by its ID
    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }
}

