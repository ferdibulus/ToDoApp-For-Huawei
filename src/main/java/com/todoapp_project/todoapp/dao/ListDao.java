package com.todoapp_project.todoapp.dao;

import org.springframework.stereotype.Repository;

import com.todoapp_project.todoapp.entity.List;

@Repository
public interface ListDao {
	List save(List list);
}
