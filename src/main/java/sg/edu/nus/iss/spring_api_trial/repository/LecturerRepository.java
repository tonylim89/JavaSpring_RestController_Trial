package sg.edu.nus.iss.spring_api_trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, String> {
}
