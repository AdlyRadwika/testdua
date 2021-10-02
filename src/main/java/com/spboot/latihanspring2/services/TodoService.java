package com.spboot.latihanspring2.services;


import com.spboot.latihanspring2.interfaces.TodoInterface;
import com.spboot.latihanspring2.models.Todo;
import com.spboot.latihanspring2.repositories.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoInterface {

    @Autowired
    private TodoRepository todoRepository;
    
    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public void store(Todo todo) {
        this.todoRepository.save(todo);
    }
}