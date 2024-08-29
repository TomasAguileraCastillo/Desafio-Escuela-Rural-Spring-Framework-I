package cl.praxis.DesafioEscuelaRural.controllers;

import cl.praxis.DesafioEscuelaRural.model.services.CourseService;
import cl.praxis.DesafioEscuelaRural.model.services.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {
    private final StudentsService studentsService;
    private final CourseService courseService ;

    //Constructor


    public StudentController(StudentsService studentsService, CourseService courseService) {
        this.studentsService = studentsService;
        this.courseService = courseService;
    }

    @GetMapping("/estudiantes")
    public String findAll(Model model){
        model.addAttribute("students", studentsService.findAll());
        return "listadoEstudiantes";

    }

    @GetMapping("/cursos")
    public String findAllCursos(Model model){
        model.addAttribute("course", courseService.findAll());
        return "listadoCursos";
    }


    @GetMapping("/dashboard")
    public String dashboard(){

        return "dash";
    }




}
