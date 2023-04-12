package novem.sectionapplication.service;
import novem.sectionapplication.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public void deleteStudent(int studentId);
    public List<Student>getAllStudents();
}
