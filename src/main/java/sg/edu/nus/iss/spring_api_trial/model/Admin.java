package sg.edu.nus.iss.spring_api_trial.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "admin")
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    
    @Id
    @Column(name = "AdminId")
    private String id;
    
    @Column(name = "AdminName")
    private String name;
    
    @Column(name = "AdminPwd")
    private String password;
}