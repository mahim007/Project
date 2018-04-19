import java.io.*;
import java.util.ArrayList;
import java.util.Date;
public class SerializeDate {

    SerializeDate(ArrayList<Student> students) {
        //Date d = new Date ();

        try {
            FileOutputStream f =
                    new FileOutputStream ("MyObj.txt");
            ObjectOutputStream s =
                    new ObjectOutputStream (f);
            s.writeObject (students);
            s.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
/*    public static void main (String args[]) {
        new SerializeDate();
    }*/
}
