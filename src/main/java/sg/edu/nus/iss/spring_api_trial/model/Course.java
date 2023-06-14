package sg.edu.nus.iss.spring_api_trial.model;

import javax.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courseId")
    private Integer id;
    
    @Column(name = "courseName")
    private String name;
    
    @Column(name = "courseStartDate")
    private Date startDate;
    
    @Column(name = "courseEndDate")
    private Date endDate;
    
    @Column(name = "courseTotalCount")
    private Integer totalCount;
    
    @Column(name = "courseSize")
    private Integer size;
    
    @Column(name = "courseCredits")
    private Double credits;
    
    @Column(name = "CourseDescription")
    private String description;
    
    @Column(name = "CourseSchedule")
    private String schedule;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> studentCourses;
    
    @OneToMany(mappedBy = "course")
    private Set<LecturerCourse> lecturerCourses;
}
