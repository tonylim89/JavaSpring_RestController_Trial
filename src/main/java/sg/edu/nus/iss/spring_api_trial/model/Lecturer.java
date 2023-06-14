package sg.edu.nus.iss.spring_api_trial.model;

import javax.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lecturer")
public class Lecturer {
    
    @Id
    @Column(name = "lecturerId")
    private String id;
    
    @Column(name = "lecturerName")
    private String name;
    
    @Column(name = "lecturerTitle")
    private String title;
    
    @Column(name = "lecturerPwd")
    private String password;
    
    @Column(name = "lecturerEmail")
    private String email;

    @OneToMany(mappedBy = "lecturer")
    private List<LecturerCourse> lecturerCourses;
}
