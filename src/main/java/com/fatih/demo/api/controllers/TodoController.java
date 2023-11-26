package com.fatih.demo.api.controllers;

import com.fatih.demo.api.models.TodoModel;
import com.fatih.demo.business.abstracts.TodoService;
import com.fatih.demo.entities.concretes.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("")
    public List<Todo> getAllTodos() {
        return this.todoService.getAllTodos();
    }

    @PostMapping("")
    public Todo createTodo(@RequestBody TodoModel model) {
        return this.todoService.createTodo(model);
    }

    @GetMapping("/{todo-id}")
    public Todo getTodoById(@PathVariable(name = "todo-id") long todoId){
        return this.todoService.getTodoById(todoId);
    }

    @DeleteMapping("/{todo-id}")
    public Boolean deleteTodoById(@PathVariable(name = "todo-id") long todoId){
        return this.todoService.deleteTodoById(todoId);
    }


}

