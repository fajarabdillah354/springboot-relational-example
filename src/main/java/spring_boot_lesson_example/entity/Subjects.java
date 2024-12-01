package spring_boot_lesson_example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring_boot_lesson_example.utils.SubjectsEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private SubjectsEnum name;

    private Long size;

    private String url;



}
