package ma.ensao.tp2;

import ma.ensao.tp2.Student.Student;
import ma.ensao.tp2.Student.StudentService;
import ma.ensao.tp2.appConfigs.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


		StudentService studentService = context.getBean(StudentService.class);


		Student student1 =new Student(100L, "hamzaaa","khribech",new Date(1/10/2002) ,20);
		studentService.createStudent(student1);


		Student foundStudent = studentService.findStudentById(1);
		System.out.println("Found Student: " + foundStudent);


		studentService.displayAllStudents();
	}

}
