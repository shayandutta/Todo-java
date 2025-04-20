package com.todo.application.controllers;

import com.todo.application.models.Todo;
import com.todo.application.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);



    @Autowired   //this object now will automatically inject spring dependencies
    private TodoService todoService;

    //to generate random id for todos
    Random random = new Random();



    //create todo objects from json data
    @PostMapping
    public ResponseEntity<Todo> todoHandler(@RequestBody Todo todo){
        //create todo
        int id = random.nextInt(999999); //generating the random id
        todo.setId(id); //whenever a new todo comes, this random id will be set to the todo via this todo setter method
        logger.info("Create Todo");

        //call service to create todo
        Todo todo1 = todoService.createTodo(todo);
        return new ResponseEntity<>(todo1, HttpStatus.CREATED);
    }
}
