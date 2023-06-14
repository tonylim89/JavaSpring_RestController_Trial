package sg.edu.nus.iss.spring_api_trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sg.edu.nus.iss.spring_api_trial.model.Course;
import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
import sg.edu.nus.iss.spring_api_trial.model.Student;
import sg.edu.nus.iss.spring_api_trial.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/students")
    public void saveStudent(@RequestBody Student student) {
        adminService.saveStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id) {
        adminService.deleteStudent(id);
    }

    @PostMapping("/lecturers")
    public void saveLecturer(@RequestBody Lecturer lecturer) {
        adminService.saveLecturer(lecturer);
    }

    @DeleteMapping("/lecturers/{id}")
    public void deleteLecturer(@PathVariable String id) {
        adminService.deleteLecturer(id);
    }

    @PostMapping("/courses")
    public void saveCourse(@RequestBody Course course) {
        adminService.saveCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        adminService.deleteCourse(id);
    }

    @PostMapping("/students/{studentId}/courses/{courseId}")
    public void enrollStudentInCourse(@PathVariable String studentId, @PathVariable Integer courseId) {
        adminService.enrollStudentInCourse(studentId, courseId);
    }

    @DeleteMapping("/students/{studentId}/courses/{courseId}")
    public void removeStudentFromCourse(@PathVariable String studentId, @PathVariable Integer courseId) {
        adminService.removeStudentFromCourse(studentId, courseId);
    }

    @PostMapping("/lecturers/{lecturerId}/courses/{courseId}")
    public void assignLecturerToCourse(@PathVariable String lecturerId, @PathVariable Integer courseId) {
        adminService.assignLecturerToCourse(lecturerId, courseId);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return adminService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable String id) {
        return adminService.getStudent(id);
    }

    @GetMapping("/lecturers")
    public List<Lecturer> getAllLecturers() {
        return adminService.getAllLecturers();
    }

    @GetMapping("/lecturers/{id}")
    public Lecturer getLecturer(@PathVariable String id) {
        return adminService.getLecturer(id);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return adminService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return adminService.getCourse(id);
    }
}
