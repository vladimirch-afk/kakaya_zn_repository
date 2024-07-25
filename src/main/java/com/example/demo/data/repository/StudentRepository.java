package com.example.demo.data.repository;

import com.example.demo.data.model.Student;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findStudentByEmail(String email);
    @Query("SELECT * FROM students WHERE name ~* :regex OR surname ~* :regex OR patronymic ~* :regex")
    List<Student> findByRegex
            (
            @Param("regex") String regex
            );

}
