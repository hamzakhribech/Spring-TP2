package ma.ensao.tp2.Student;

import java.util.*;

public class InMemoryStudentRepository implements StudentRepository{
    private List< Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> findAll() {
        return  students;
    }

}
