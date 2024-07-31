package com.example.demo.controller;

import com.example.demo.api.AdminApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController implements AdminApi {
    @Override
    @PostMapping("/admin/create/course")
    public void createCourse(
            @RequestParam String subject,
            @RequestParam int type
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/create/group")
    public void createGroup(
            @RequestParam String name,
            @RequestParam int course_id
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/create/student")
    public void createStudent(@RequestParam String name,
                              @RequestParam String surname,
                              @RequestParam String patronymic,
                              @RequestParam String email,
                              @RequestParam String password,
                              @RequestParam List<Integer> group_list
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/create/teacher")
    public void createTeacher(@RequestParam String name,
                              @RequestParam String surname,
                              @RequestParam String patronymic,
                              @RequestParam String email,
                              @RequestParam String password,
                              @RequestParam String subject
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/delete/course")
    public void deleteCourse(
            @RequestParam String name
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/delete/group")
    public void deleteGroup(
            @RequestParam String name
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/delete/student")
    public void deleteStudent(
            @RequestParam String email
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/delete/teacher")
    public void deleteTeacher(
            @RequestParam String email
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/delete/file")
    public void deleteFile(
            @RequestParam String link
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/edit/student")
    public void editStudent(@RequestParam String name,
                            @RequestParam String surname,
                            @RequestParam String patronymic,
                            @RequestParam String email,
                            @RequestParam String password,
                            @RequestParam List<Integer> group_list
    ) {
        //TODO()
    }

    @Override
    @PostMapping("/admin/edit/teacher")
    public void editTeacher(@RequestParam String name,
                            @RequestParam String surname,
                            @RequestParam String patronymic,
                            @RequestParam String email,
                            @RequestParam String password,
                            @RequestParam String subject) {
        //TODO()
    }

    @Override
    @GetMapping("/admin/info/all-students")
    public String getAllStudents(@RequestParam String email) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/all-teachers")
    public String getAllTeachers(@RequestParam String email) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/all-courses")
    public String getAllCourses(@RequestParam String email) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/all-groups")
    public String getAllGroups(@RequestParam String email) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/all-files")
    public String getAllFiles() {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/student")
    public String getStudent(
            @RequestParam String email
    ) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/teacher")
    public String getTeacher(
            @RequestParam String email
    ) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/course")
    public String getCourse(
            @RequestParam String name
    ) {
        //TODO()
        return "";
    }

    @Override
    @GetMapping("/admin/info/group")
    public String getGroup(
            @RequestParam String name
    ) {
        //TODO()
        return "";
    }
}
