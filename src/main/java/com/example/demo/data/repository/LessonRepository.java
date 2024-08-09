package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Lesson;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
    List<Lesson> findLessonsByDate(LocalDateTime date);

    List<Lesson> findLessonsByDeadline(LocalDateTime deadline);

    List<Lesson> findLessonsByGroupId(Integer group_id);
}
