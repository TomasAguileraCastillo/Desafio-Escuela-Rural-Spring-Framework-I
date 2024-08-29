package cl.praxis.DesafioEscuelaRural.model.repository;

import cl.praxis.DesafioEscuelaRural.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
