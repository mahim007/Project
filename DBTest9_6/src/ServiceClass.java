import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by User PC on 6/9/16.
 */
public class ServiceClass extends MyDBClass{

    public boolean InsetDB(String name ) {
        this.getConnection();


        String sql = "INSERT INTO STUDENT(NAME) VALUES(?)";

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            //rs = ps.executeQuery();
            ps.executeUpdate();

            ps.close();
            //rs.close();
            connection.close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Student> SelectAllFromDB() {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student;

        this.getConnection();
        String sql = "SELECT * FROM STUDENT";

        try
        {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));

                students.add(student);

            }
            ps.close();
            rs.close();
            connection.close();
            return  students;

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return null;

    }
}