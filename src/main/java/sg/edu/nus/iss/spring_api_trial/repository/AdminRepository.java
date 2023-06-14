package sg.edu.nus.iss.spring_api_trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.spring_api_trial.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {}