package ma.ensao.tp2.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class StudentServiceMock implements StudentService{
    @Override
    public void createStudent(Student student) {
        System.out.println("Creating student: " + student);
        // Mock implementation for creating student
        System.out.println("Mock implementation for creating student");
    }

    @Override
    public Student findStudentById(int id) {
        // Mock implementation for finding student by id
        System.out.println("Searching for student with ID: " + id);
        System.out.println("Mock implementation for finding student by id");
        // Returning a dummy student for demonstration
        return new Student(1L, "hamza","kh",new Date(1/10/2002) ,20); // Dummy student with ID, name, and age
    }

    @Override
    public void displayAllStudents() {

        System.out.println("Displaying all students:");

        for (int i = 1; i <= 3; i++) {
            System.out.println(new Student((long) i, "hamza-"+i,"kh"+i,new Date(1/i/2002) ,15+i));
        }
    }

}
