package com.fatih.demo.business.abstracts;

import com.fatih.demo.api.models.TodoModel;
import com.fatih.demo.entities.concretes.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo createTodo(TodoModel todoModel);

    Todo getTodoById(long id);

    Boolean deleteTodoById(long id);

}
