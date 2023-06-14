package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import sg.edu.nus.iss.spring_api_trial.model.Lecturer;

public interface LecturerService {
    List<Lecturer> getAllLecturers();
    Lecturer getLecturerById(String id);
    void saveLecturer(Lecturer lecturer);
    void deleteLecturer(String id);
}
