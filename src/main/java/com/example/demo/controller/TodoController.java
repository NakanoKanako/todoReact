package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TodoService;
import com.example.demo.entity.Todo;

@RestController
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@GetMapping("/list")
	public List<Todo> getTodo() {
		List<Todo> todoList = todoService.getTodoList();
		return todoList;
	}
}
