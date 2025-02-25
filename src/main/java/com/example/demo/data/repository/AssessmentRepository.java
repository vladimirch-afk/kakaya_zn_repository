package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Assessment;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssessmentRepository extends CrudRepository<Assessment, Integer> {
    List<Assessment> findAssessmentsByChecked(Boolean checked);

    @Query("SELECT a.* FROM assessments a JOIN students s ON a.student_id = s.id " +
            "WHERE CONCAT(s.name, ' ', s.surname, ' ', s.patronymic) ~ :regexPattern")
    List<Assessment> findAssessmentsByStudentRegex(String regexPattern);

    List<Assessment> findAssessmentsByStudentId(Integer student_id);

    List<Assessment> findAssessmentsByLessonId(Integer lesson_id);
}
