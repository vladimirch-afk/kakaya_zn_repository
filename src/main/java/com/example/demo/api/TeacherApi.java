package com.example.demo.api;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface TeacherApi {

    public String getTimetable(String email);

    public String getLesson(int lessonId);

    public void addMaterial(int lessonId, int materialId);

    public void addTask(int lessonId, int taskId);

    public void createLesson(int groupId, LocalDateTime date, LocalDateTime deadline);

    public void createTask(boolean testType, String subject, String text, String optionsList);

    public void createMaterial(String name, String link);

    public String getAllAssessments(String email);

    public String getAssessment(int assessmentId);

    public void checkAssessment(int lessonId, int assessmentId, int mark);


}
