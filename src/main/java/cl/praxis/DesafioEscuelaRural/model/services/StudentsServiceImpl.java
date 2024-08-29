package cl.praxis.DesafioEscuelaRural.model.services;

import cl.praxis.DesafioEscuelaRural.model.entities.Student;
import cl.praxis.DesafioEscuelaRural.model.repository.StudentsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StudentsServiceImpl implements StudentsService {


    private final StudentsRepository repoStudent;

    //Consuctor
    public StudentsServiceImpl(StudentsRepository repoStudent) {
        this.repoStudent = repoStudent;
    }


    ///////////////////////////////////////////
    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return repoStudent.findAll();
    }

    ///////////////////////////////////////////
    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {

        return repoStudent.findById(id).orElse(null);
    }

    ///////////////////////////////////////////
    @Override
    @Transactional
    public boolean create(Student s) {
        Student studentResp = repoStudent.save(s);
        return studentResp != null ;
    }

    ///////////////////////////////////////////
    @Override
    @Transactional
    public boolean update(Student s) {
        Student studentResp = repoStudent.save(s);
        return studentResp != null ;
    }

    ///////////////////////////////////////////
    @Override
    @Transactional
    public boolean delete(int id) {
        boolean exists = repoStudent.existsById(id);
        if(exists){
            repoStudent.deleteById(id);
        }
        return exists;
    }
}
