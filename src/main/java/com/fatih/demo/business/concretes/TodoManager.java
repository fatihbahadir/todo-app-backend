package com.fatih.demo.business.concretes;

import com.fatih.demo.api.models.TodoModel;
import com.fatih.demo.business.abstracts.TodoService;
import com.fatih.demo.dataAccess.abstracts.TodoDao;
import com.fatih.demo.entities.concretes.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoManager implements TodoService {

    private final TodoDao todoDao;

    @Override
    public List<Todo> getAllTodos() {
        return this.todoDao.findAll();
    }

    @Override
    public Todo createTodo(TodoModel todoModel) {
        return this.todoDao.save(
                Todo.builder()
                        .todoText(todoModel.getTodoText())
                        .build()
        );
    }

    @Override
    public Todo getTodoById(long id) {
        return this.todoDao.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteTodoById(long id) {
        try {
            this.todoDao.deleteById(id);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
