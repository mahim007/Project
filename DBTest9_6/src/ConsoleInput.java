import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User PC on 6/9/16.
 */
public class ConsoleInput  {
    public static void main(String[] args)
    {
        System.out.println("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.print(name);
        ServiceClass serviceClass = new ServiceClass();
       if (serviceClass.InsetDB(name))
       {
           System.out.println("Table updated Successfully!");
       }
        else
       {
        System.out.println("Try Again Please!");
       }

        /*ArrayList<Student> students =  serviceClass.SelectAllFromDB();
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
*/
    }
}
