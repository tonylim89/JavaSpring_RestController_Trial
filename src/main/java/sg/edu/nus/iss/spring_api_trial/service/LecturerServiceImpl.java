package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import sg.edu.nus.iss.spring_api_trial.exception.ResourceNotFoundException;
import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
import sg.edu.nus.iss.spring_api_trial.repository.LecturerRepository;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    @Override
    public void saveLecturer(Lecturer lecturer) {
        lecturerRepository.save(lecturer);
    }

    @Override
    public void deleteLecturer(String id) {
        lecturerRepository.deleteById(id);
    }

    @Override
    public List<Lecturer> getAllLecturers() {
        return lecturerRepository.findAll();
    }

    @Override
    public Lecturer getLecturerById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLecturerById'");
    }
}
