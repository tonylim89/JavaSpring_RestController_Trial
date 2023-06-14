package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import sg.edu.nus.iss.spring_api_trial.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    void saveStudent(Student student);
    void deleteStudent(String id);
}
