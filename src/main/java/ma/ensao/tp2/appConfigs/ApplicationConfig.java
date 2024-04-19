package ma.ensao.tp2.appConfigs;

import ma.ensao.tp2.Student.InMemoryStudentRepository;
import ma.ensao.tp2.Student.StudentRepository;
import ma.ensao.tp2.Student.StudentService;
import ma.ensao.tp2.Student.StudentServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService studentService() {
        return new StudentServiceMock(); // or return new StudentServiceImpl(studentRepository());
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}
