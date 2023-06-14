package sg.edu.nus.iss.spring_api_trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
import sg.edu.nus.iss.spring_api_trial.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lecturers")
public class LecturerController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Lecturer> getAllLecturers() {
        return adminService.getAllLecturers();
    }

    @GetMapping("/{id}")
    public Lecturer getLecturer(@PathVariable String id) {
        return adminService.getLecturer(id);
    }

    @PostMapping
    public void saveLecturer(@RequestBody Lecturer lecturer) {
        adminService.saveLecturer(lecturer);
    }

    @DeleteMapping("/{id}")
    public void deleteLecturer(@PathVariable String id) {
        adminService.deleteLecturer(id);
    }
}
