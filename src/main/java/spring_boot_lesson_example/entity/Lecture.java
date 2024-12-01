package spring_boot_lesson_example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lecture")
@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

}
