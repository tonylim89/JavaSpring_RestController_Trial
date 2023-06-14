package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import sg.edu.nus.iss.spring_api_trial.model.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Integer id);
    void saveCourse(Course course);
    void deleteCourse(Integer id);
}
