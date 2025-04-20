package com.todo.application.services;

import com.todo.application.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TodoService {

    //to check if todo has been created? or not
    Logger logger = LoggerFactory.getLogger(TodoService.class);



    //since we are not using database, so lets make a list of todos which will act as a fake database. Jitne v todo hum banayenge woh is list mein add hote rahenge.
    List<Todo> todos = new ArrayList<>();

    //create todo method
    public Todo createTodo(Todo todo){
        //create...
        //change the logic to and when move the todo to database
        todos.add(todo);
        logger.info("Todos {} ", this.todos);
        return todo;
    }
}
