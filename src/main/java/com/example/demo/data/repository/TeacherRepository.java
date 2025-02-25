package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Student;
import com.example.demo.data.model.entities.Teacher;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
    List<Teacher> findTeachersBySubject(String subject);

    Teacher findTeacherByEmail(String email);

    @Query("SELECT * FROM teachers WHERE name ~* :regex OR surname ~* :regex OR patronymic ~* :regex")
    List<Teacher> findTeachersByRegex
            (
                    @Param("regex") String regex
            );
}
