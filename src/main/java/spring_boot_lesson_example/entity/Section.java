package spring_boot_lesson_example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplicationRunListener;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "section")
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;


    private Integer orders;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectureList;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;


}
