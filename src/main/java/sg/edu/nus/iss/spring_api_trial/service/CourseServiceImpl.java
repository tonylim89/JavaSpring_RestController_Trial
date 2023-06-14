package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sg.edu.nus.iss.spring_api_trial.exception.ResourceNotFoundException;
import sg.edu.nus.iss.spring_api_trial.model.Course;
import sg.edu.nus.iss.spring_api_trial.repository.CourseRepository;

@Data
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

@Override
public Course getCourseById(Integer id) {
    return courseRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + id));
}
}
