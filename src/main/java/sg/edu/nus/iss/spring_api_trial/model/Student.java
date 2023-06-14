package sg.edu.nus.iss.spring_api_trial.model;

import javax.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {
    
    @Id
    @Column(name = "stuId")
    private String id;
    
    @Column(name = "stuFirstName")
    private String firstName;
    
    @Column(name = "stuLastName")
    private String lastName;
    
    @Column(name = "stuGPA")
    private Double gpa;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "stuPwd")
    private String password;
    
    @Column(name = "stuEnrollDate")
    private Date enrollDate;

    @OneToMany(mappedBy = "student")
    private List<StudentCourse> studentCourses;
}
