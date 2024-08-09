package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface MaterialRepository extends CrudRepository<Task, Integer> {

}
