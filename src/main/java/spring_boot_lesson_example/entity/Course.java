package spring_boot_lesson_example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    private String title;


    private String description;


    @OneToMany(mappedBy = "courses")
    private List<Section> sections;


}
