package com.example.demo.api;

import com.example.demo.data.model.Course;

import java.util.List;

public interface AdminApi {
    void createCourse(String subject, int type);

    void createGroup(String name, int course_id);

    void createStudent(String name,
                              String surname,
                              String patronymic,
                              String email,
                              String password,
                              List<Integer> group_list);

    void createTeacher(String name,
                              String surname,
                              String patronymic,
                              String email,
                              String password,
                              String subject);

    void deleteCourse(String name);

    void deleteGroup(String name);

    void deleteStudent(String email);

    void deleteTeacher(String email);

    void deleteFile(String link);

    void editStudent(String name,
                              String surname,
                              String patronymic,
                              String email,
                              String password,
                              List<Integer> group_list);

    void editTeacher(String name,
                              String surname,
                              String patronymic,
                              String email,
                              String password,
                              String subject);

    String getAllStudents(String email);

    String getAllTeachers(String email);

    String getAllCourses(String email);

    String getAllGroups(String email);

    String getStudent(String email);

    String getTeacher(String email);

    String getCourse(String name);

    String getGroup(String name);
}
