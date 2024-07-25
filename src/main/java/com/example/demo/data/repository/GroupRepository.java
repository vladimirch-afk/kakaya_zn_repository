package com.example.demo.data.repository;

import com.example.demo.data.model.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Integer> {
    List<Group> findAllByCourseId(int course_id);
    List<Group> findAllByName(String name);
}