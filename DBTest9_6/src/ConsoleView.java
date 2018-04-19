import java.util.ArrayList;

/**
 * Created by ICT-Lab PC on 1/1/02.
 */
public class ConsoleView {

    public static void main(String[] args)
    {
        ServiceClass serviceClass = new ServiceClass();
       ArrayList<Student> students =  serviceClass.SelectAllFromDB();
        System.out.println("-----------------------");
        Student student;
        System.out.println("| ID |"+"    Name         |");
        System.out.println("-----------------------");
        for (int i=0; i< students.size(); i++)
        {
            student = students.get(i);
            System.out.println("| "+student.getId()+" |   "+student.getName()+"   |");
            System.out.println("-----------------------");
        }
    }
}
