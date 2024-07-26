package com.example.demo.controller;

import com.example.demo.api.TeacherApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TeacherController implements TeacherApi {
    @Override
    @GetMapping("/teacher/timetable")
    public String getTimetable(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return null;
    }

    @Override
    @GetMapping("/teacher/timetable/lesson")
    public String getLesson(
            @RequestParam(name = "lesson_id") int lessonId
    ) {
        //TODO()
        return null;
    }

    @Override
    @PostMapping("teacher/timetable/add/material")
    public void addMaterial(
            @RequestParam(name = "lesson_id") int lessonId,
            @RequestParam(name = "material_id") int materialId
    ) {
        //TODO()
    }

    @Override
    @PostMapping("teacher/timetable/add/task")
    public void addTask(
            @RequestParam(name = "lesson_id") int lessonId,
            @RequestParam(name = "task_id") int taskId
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/teacher/create/lesson")
    public void createLesson(
            @RequestParam(name = "group_id") int groupId,
            @RequestParam(name = "date") LocalDateTime date,
            @RequestParam(name = "deadline") LocalDateTime deadline
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/teacher/create/task")
    public void createTask(
            @RequestParam(name = "test_type") boolean testType,
            @RequestParam(name = "subject") String subject,
            @RequestParam(name = "text") String text,
            @RequestParam(name = "options_list") String optionsList) {
        //TODO()
    }

    @Override
    @PostMapping("/teacher/create/material")
    public void createMaterial(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "link") String link
    ) {
        //TODO()
    }

    @Override
    @GetMapping("/teacher/assessment/all")
    public String getAllAssessments(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return null;
    }

    @Override
    @GetMapping("/teacher/assessment")
    public String getAssessment(
            @RequestParam(name = "assessment_id") int assessmentId
    ) {
        //TODO()
        return null;
    }

    @Override
    @PostMapping("/teacher/assessment/check")
    public void checkAssessment(
            @RequestParam(name = "lesson_id") int lessonId,
            @RequestParam(name = "assessment_id") int assessmentId,
            @RequestParam(name = "mark") int mark
    ) {
        //TODO()
    }
}
