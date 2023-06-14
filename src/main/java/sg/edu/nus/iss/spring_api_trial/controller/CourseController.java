package sg.edu.nus.iss.spring_api_trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.edu.nus.iss.spring_api_trial.model.Course;
import sg.edu.nus.iss.spring_api_trial.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Course> getAllCourses() {
        return adminService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return adminService.getCourse(id);
    }

    @PostMapping
    public void saveCourse(@RequestBody Course course) {
        adminService.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        adminService.deleteCourse(id);
    }
}
