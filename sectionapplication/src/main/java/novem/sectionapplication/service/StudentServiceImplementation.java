package novem.sectionapplication.service;
import novem.sectionapplication.model.Student;
import novem.sectionapplication.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepo.deleteById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


}
