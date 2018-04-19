import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class DeSerializeDate {

    DeSerializeDate () {


        //System.out.println("Deserialized Date object from date.ser");
       // System.out.println("Date: "+d);
    }

    public ArrayList<Student> PlzDoDeserizlize()
    {
        ArrayList<Student> d = null;

        try {
            FileInputStream f =
                    new FileInputStream ("MyObj.txt");
            ObjectInputStream s =
                    new ObjectInputStream (f);
            d = (ArrayList<Student>) s.readObject();
            s.close ();
            //return  d;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return  d;
    }
/*
    public static void main (String args[]) {
        new DeSerializeDate();
    }*/
}
