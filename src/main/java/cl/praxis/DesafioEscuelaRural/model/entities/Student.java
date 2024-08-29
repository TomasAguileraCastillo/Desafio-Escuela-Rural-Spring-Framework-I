package cl.praxis.DesafioEscuelaRural.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students_erural")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /////////////////////////////
    @Column(name = "id_students")
    private int idStudents;
    /////////////////////////////
    @Column(name = "first_name_students")
    private String  firstNameStudents;
    /////////////////////////////
    @Column(name = "last_name_students")
    private  String lastNameStudents;
    /////////////////////////////
    private String emailStudents;
    /////////////////////////////


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_course_students", insertable = true, updatable = true)
    private Course c;






}
