package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoMapper;

@Service
public class TodoService {

  @Autowired
  private TodoMapper todoMapper;

  public List<Todo> getTodoList(){
    return todoMapper.todoList();
  }
}
