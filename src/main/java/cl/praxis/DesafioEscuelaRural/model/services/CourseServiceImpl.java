package cl.praxis.DesafioEscuelaRural.model.services;

import cl.praxis.DesafioEscuelaRural.model.entities.Course;
import cl.praxis.DesafioEscuelaRural.model.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseRepository repoCourse;

    //Constructor
    public CourseServiceImpl(CourseRepository repoCourse) {
        this.repoCourse = repoCourse;
    }



    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return repoCourse.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Course findById(int id) {
        return repoCourse.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public boolean create(Course c) {
        Course courseResp = repoCourse.save(c);
        return courseResp != null;
    }

    @Override
    @Transactional
    public boolean update(Course c) {
        Course courseResp = repoCourse.save(c);
        return courseResp != null;
    }

    @Override
    @Transactional
    public boolean delete(int id) {

        boolean exist = repoCourse.existsById(id);

        if (exist ) {
            repoCourse.deleteById(id);

        }
        return exist;




    }
}
