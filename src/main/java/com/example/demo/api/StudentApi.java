package com.example.demo.api;

public interface StudentApi {

    public String getAllLessons(String email);

    public String getLesson(int lessonId);

    public String getTimetable(String email);

    public void createAssessment(String content);

    public String getAllMarks(String email);

    public String getAllTasks(String email);

    public String getTask(int taskId);
}
