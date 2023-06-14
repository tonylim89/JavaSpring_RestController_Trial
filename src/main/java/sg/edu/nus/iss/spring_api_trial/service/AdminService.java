package sg.edu.nus.iss.spring_api_trial.service;


import java.util.List;

import sg.edu.nus.iss.spring_api_trial.model.Course;
import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
import sg.edu.nus.iss.spring_api_trial.model.Student;

public interface AdminService {
    List<Student> getAllStudents();
    Student getStudent(String id);
    void saveStudent(Student student);
    void deleteStudent(String id);

    List<Lecturer> getAllLecturers();
    Lecturer getLecturer(String id);
    void saveLecturer(Lecturer lecturer);
    void deleteLecturer(String id);

    List<Course> getAllCourses();
    Course getCourse(Integer id);
    void saveCourse(Course course);
    void deleteCourse(Integer id);

    void enrollStudentInCourse(String studentId, Integer courseId);
    void removeStudentFromCourse(String studentId, Integer courseId);
    void assignLecturerToCourse(String lecturerId, Integer courseId);
}