package com.example.demo.data.model.usecase;

import com.example.demo.data.repository.StudentRepository;
import com.example.demo.data.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizeUserUseCase {
    private final StudentRepository repositoryS;
    private final TeacherRepository repositoryT;

    public boolean authorizeUser(String email, String password) {
        if (email == null || password == null) {
            return false;
        }

        var student = repositoryS.findStudentByEmail(email);
        if (student != null && student.getPassword().equals(password)) {
            return true;
        }

        var teacher = repositoryT.findTeacherByEmail(email);
        if (teacher != null && teacher.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}
