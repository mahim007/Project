import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by ICT LAB PC on 5/10/17.
 */
public class HashSetExample {

    public static void view(Iterator<Student> it)
    {
        while (it.hasNext())
        System.out.println(it.next());
    }

    public static void main(String[] args)
    {
       // HashSet<String> hs = new HashSet<String>();
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("IT10001","Asraful Alam"));
        al.add(new Student("IT10002","Abdullah"));
        al.add(new Student("IT10003","Abdur Rahim"));
        al.add(new Student("IT10004","Mitu Sarkar"));
        /*hs.add("Al Hasan");
        hs.add("Al Hasan");
        hs.add("Autish Moulik");
        hs.add("Zakareya");
        view(hs.iterator());*/
        view(al.iterator());
    }
}
