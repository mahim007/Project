package mbstu;

import tup.StaticTest;

/**
 * Created by ICT LAB PC on 4/27/17.
 */
public class MyClass extends StaticTest  {
    public MyClass(int count) {
        super(count);
    }

    /*public MyClass(int count) {
        super(count);
    }*/

    public static void main(String[] args)
    {
        StaticTest staticTest1 = new StaticTest(12);
        StaticTest staticTest2 = new StaticTest(12);
        StaticTest staticTest3 = new StaticTest(12);
        //int count =staticTest1.count;

        System.out.println("For Static Field\nValue of Count 1:" + staticTest1.getCount());
        System.out.println("Value of Count 1:" + staticTest2.getCount());
        System.out.println("Value of Count 1:" + staticTest3.getCount());

        System.out.println("\nFor Non Static Field\nValue of Count 1:"+staticTest1.getNonStaticValue());
        System.out.println("Value of Count 1:"+staticTest2.getNonStaticValue());
        System.out.println("Value of Count 1:"+staticTest3.getNonStaticValue());

    }
}
