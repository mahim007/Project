import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 3/16/15.
 */
public class FileTest {

    String id1;
    String name1;
    String gpa1;

    public void WriteIntoFile(File file)
    {


        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        double gpa;

        System.out.print("ID:");
        id = scanner.nextLine();

        System.out.print("Name:");
        name = scanner.nextLine();


        System.out.print("CGPA:");
        gpa = scanner.nextDouble();

        try
        {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(id+"\n");
            fileWriter.write(name+"\n");
            fileWriter.write(gpa+"\n");

            fileWriter.close();

            Desktop.getDesktop().open(file);

        }
        catch (IOException iex)
        {
            iex.printStackTrace();
        }
        //System.out.println("Salam!");
    }

    public void ReadFromFile(File file)throws IOException
    {
        String id="blank", name, cgpa;
        Scanner scanner = new Scanner(file);

        Scanner scanner1 = new Scanner(System.in);
        String searchIteam;

        System.out.println("Student ID you want to search:");
        searchIteam = scanner1.next();
        int count=0;

        while (scanner.hasNext())
        {
         id = scanner.nextLine();
         name = scanner.nextLine();
         cgpa = scanner.nextLine();
           // System.out.print("Student ID:"+id+" "+"Name:"+name+" "+"CGPA:"+cgpa+"\n");

          if(id.equals(searchIteam))
           {
           System.out.print("Student ID:"+id+"\n"+"Name:"+name+"\n"+"CGPA:"+cgpa+"\n");
               ++count;
           }

        }
        if (count == 0)
        {
            System.out.println("The ID you have entered is "+searchIteam+" that is not available in the File");
        }
    }

    public ArrayList<Student> getAllDataAsList(File file)
    {
        Student st;


        ArrayList<Student> ss = new ArrayList<Student>();
        try
        {
        Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
            {
                this.id1 = scanner.nextLine();
                this.name1 = scanner.nextLine();
                this.gpa1 = scanner.nextLine();

                st = new Student();
                st.setId(id1);
                st.setName(name1);
                st.setGpa(gpa1);
                ss.add(st);
                // System.out.print("Student ID:"+id+" "+"Name:"+name+" "+"CGPA:"+cgpa+"\n");

            }
            return ss;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return  null;




    }

    public void printAsHTML(ArrayList<Student> students)
    {
        Student student;
        File file = new File("myFile.htm");

        try
        {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("<html>");
            fileWriter.write("<body>");
            fileWriter.write("<table border="+"1"+">");

            for (int i=0; i < students.size(); i++)
            {
                fileWriter.write("<tr>");
                student = students.get(i);
            fileWriter.write("<td>"+student.getId() +"</td>");
                fileWriter.write("<td>"+student.getName() +"</td>");
                fileWriter.write("<td>"+student.getGpa() +"</td>");
                fileWriter.write("</tr>");
            }
           fileWriter.write("</table></body></html>");
            fileWriter.close();
            Desktop.getDesktop().open(file);
        }
        catch(IOException e)
        {
            e.printStackTrace();

        }


    }
    public static void main (String[] arg)throws IOException
    {
        //File file = new File("MyObj.txt");
        File file = new File("test.txt");
       FileTest fileTest=new FileTest();
        fileTest.WriteIntoFile(file);
        //System.out.println(fileTest);
        fileTest.ReadFromFile(file);
        Student ss1;
        ArrayList<Student> students = fileTest.getAllDataAsList(file);
       // ArrayList<Student> students = new DeSerializeDate().PlzDoDeserizlize();
        //new SerializeDate(students);
        fileTest.printAsHTML(students);

        /*for (int i=0; i< students.size(); i++)
        {
            ss1 = students.get(i);
            System.out.print("Student ID:"+ss1.getId()+"\n");
            System.out.print("Name:"+ss1.getName()+"\n");
            System.out.print("CGPA:"+ss1.getGpa()+"\n");

        }*/

    }
}
