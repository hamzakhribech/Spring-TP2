package ma.ensao.tp2.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayAllStudents();
}
