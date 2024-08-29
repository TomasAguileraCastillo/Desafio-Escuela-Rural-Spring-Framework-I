package cl.praxis.DesafioEscuelaRural.model.services;

import cl.praxis.DesafioEscuelaRural.model.entities.Student;

import java.util.List;

public interface StudentsService {
        List<Student> findAll(); //trae el listado
        Student findById(int id);//busca por un Registro
        boolean create (Student s); //crea registro
        boolean update (Student s); // actualiza registro
        boolean delete (int id); //elimina registro

}
