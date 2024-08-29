package cl.praxis.DesafioEscuelaRural.model.repository;

import cl.praxis.DesafioEscuelaRural.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student,Integer> {
}
