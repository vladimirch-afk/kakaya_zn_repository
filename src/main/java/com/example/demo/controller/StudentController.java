package com.example.demo.controller;

import com.example.demo.api.StudentApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentApi {
    @Override
    @GetMapping("/student/all-lessons")
    public String getAllLessons(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return email;
    }

    @Override
    @GetMapping("/student/lesson")
    public String getLesson(
            @RequestParam(name = "lesson_id") int lessonId
    ) {
        //TODO()
        return null;
    }

    @Override
    @GetMapping("/student/timetable")
    public String getTimetable(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return null;
    }

    @Override
    @PostMapping("/student/assessment/create")
    public void createAssessment(
            @RequestParam(name = "content") String content
    ) {
        //TODO()
    }

    @Override
    @GetMapping("/student/all-marks")
    public String getAllMarks(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return null;
    }

    @Override
    @GetMapping("/student/all-tasks")
    public String getAllTasks(
            @RequestParam(name = "email") String email
    ) {
        //TODO()
        return null;
    }

    @Override
    @GetMapping("student/task")
    public String getTask(
            @RequestParam(name = "task_id") int taskId
    ) {
        //TODO()
        return null;
    }
}
