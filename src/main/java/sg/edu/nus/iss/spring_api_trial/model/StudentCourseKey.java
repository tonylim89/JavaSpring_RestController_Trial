package sg.edu.nus.iss.spring_api_trial.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class StudentCourseKey implements Serializable {
    
    private String stuId;
    private Integer courseId;

}
