package sg.edu.nus.iss.spring_api_trial.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class LecturerCourseKey implements Serializable {
    
    private String lecturerId;
    private Integer courseId;

}
