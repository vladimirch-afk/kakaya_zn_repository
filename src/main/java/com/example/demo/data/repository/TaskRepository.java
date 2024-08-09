package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findBySubjectAndTestType(String subject, Boolean testType);

    List<Task> findBySubject(String subject);

    List<Task> findByTestType(Boolean testType);
}
