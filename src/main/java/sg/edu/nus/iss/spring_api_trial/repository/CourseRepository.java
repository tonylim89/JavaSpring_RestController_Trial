package sg.edu.nus.iss.spring_api_trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.spring_api_trial.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
