package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    List<Course> findCourseByType(Integer type);

    List<Course> findCourseBySubject(String subject);
}
