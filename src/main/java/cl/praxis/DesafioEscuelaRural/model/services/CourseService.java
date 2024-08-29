package cl.praxis.DesafioEscuelaRural.model.services;

import cl.praxis.DesafioEscuelaRural.model.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll(); //trae el listado
    Course findById(int id);//busca por un Registro
    boolean create (Course s); //crea registro
    boolean update (Course s); // actualiza registro
    boolean delete (int id); //elimina registro

}
