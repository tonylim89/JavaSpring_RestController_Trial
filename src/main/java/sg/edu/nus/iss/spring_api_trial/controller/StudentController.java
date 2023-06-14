package sg.edu.nus.iss.spring_api_trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.edu.nus.iss.spring_api_trial.model.Student;
import sg.edu.nus.iss.spring_api_trial.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Student> getAllStudents() {
        return adminService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        return adminService.getStudent(id);
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student) {
        adminService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        adminService.deleteStudent(id);
    }
}
