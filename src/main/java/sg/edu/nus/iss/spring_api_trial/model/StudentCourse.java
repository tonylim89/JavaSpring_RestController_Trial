package sg.edu.nus.iss.spring_api_trial.model;

import java.util.*;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "studentcourse")
public class StudentCourse {
    
    @EmbeddedId
    private StudentCourseKey id;
    
    @ManyToOne
    @MapsId("stuId")
    @JoinColumn(name = "stuId")
    private Student student;
    
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courseId")
    private Course course;
    
    @Column(name = "enrollStatus")
    private String enrollStatus;
    
    @Column(name = "Score")
    private Double score;
    
    @Column(name = "enrollDate")
    private Date enrollDate;
}
