import org.hibernate.Session;
/**
 * Created by Monir on 5/10/17.
 */
public class TestStudentWithHibernate {

    public static void main(String[] args)
    {
        Session session =  Connector.getSession();
        session.beginTransaction();

        Student student = new Student();
        student.setStudentId("IT12009");
        student.setStudentFirstName("Abdur");
        student.setStudentLastName("Rahman");
        student.setStudentEmail("abdur.rahman@gmail.com");

        session.save(student);
        session.getTransaction().commit();

    }
}
