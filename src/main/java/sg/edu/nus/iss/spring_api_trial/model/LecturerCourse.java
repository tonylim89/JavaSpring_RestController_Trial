package sg.edu.nus.iss.spring_api_trial.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lecturercourse")
public class LecturerCourse {
    
    @EmbeddedId
    private LecturerCourseKey id;
    
    @ManyToOne
    @MapsId("lecturerId")
    @JoinColumn(name = "lecturerId")
    private Lecturer lecturer;
    
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courseId")
    private Course course;
}
