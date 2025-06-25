package com.todo.config;

import com.todo.models.TodoItem;
import com.todo.repositories.TodoItemRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoItemDataLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(TodoItemDataLoader.class);

    @Autowired
    TodoItemRepository todoItemRepository;

    @Override
    public void run(String ...args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData(){
        if (todoItemRepository.count() == 0) {
            todoItemRepository.save(new TodoItem("task 1"));
            todoItemRepository.save(new TodoItem("task 2"));
        }
        logger.info("Number of TodoItems: {}", todoItemRepository.count());
    }
}
