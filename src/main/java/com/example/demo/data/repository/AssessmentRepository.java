package com.example.demo.data.repository;

import com.example.demo.data.model.Assessment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssessmentRepository extends CrudRepository<Assessment, Integer> {
    List<Assessment> findAssessmentsByChecked(Boolean checked);
}
