package ma.ensao.tp2.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository  {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();


}
