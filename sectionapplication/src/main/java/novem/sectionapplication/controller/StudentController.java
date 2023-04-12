package novem.sectionapplication.controller;

import novem.sectionapplication.model.Student;
import novem.sectionapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student added";
    }

    @GetMapping ("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @PostMapping("/delete")
    public String deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student.getId());
        return "Deleted student!";
    }
}
