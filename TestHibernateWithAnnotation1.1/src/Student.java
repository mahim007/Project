
/**
 * Created by Monir on 5/10/17.
 */
import javax.persistence.*;

@Entity
@Table(name="student_ict")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (unique = false, nullable = false)
    private String studentId;
    private String studentFirstName;
    private String studentLastName;
    private String studentEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@Column(name = "s_name", nullable = false, length = 10,unique = true)

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
