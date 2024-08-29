package cl.praxis.DesafioEscuelaRural.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "course_erural")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private int idCourse;
    //////////////////////////////
    @Column(name="course_course")
    private String course;

    private String teacherCourse;





}
