package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo;

@Mapper
public interface TodoMapper {

  List<Todo> todoList();
}
