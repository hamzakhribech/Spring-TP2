package ma.ensao.tp2.Student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data//pour grnere automatiquement les getters et le setters
@NoArgsConstructor//constructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String  nom;
    private String  familyName;
    private Date birthDate;
    private int score;

}
