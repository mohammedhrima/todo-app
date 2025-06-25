package com.todo.repositories;

import com.todo.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
