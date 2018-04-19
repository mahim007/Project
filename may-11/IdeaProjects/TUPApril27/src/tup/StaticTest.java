package tup;

/**
 * Created by ICT LAB PC on 4/27/17.
 */
public class StaticTest {
    protected static int count=1;
    private int nonStaticValue;

    public int getNonStaticValue() {
        return ++nonStaticValue;
    }
    public void setNonStaticValue(int nonStaticValue) {
        this.nonStaticValue = nonStaticValue;
    }

    public StaticTest(int count) {
        StaticTest.setCount(count);
        this.setNonStaticValue(count);
    }
    public static int getCount() {
        return count++;
    }
    public static void setCount(int count) {
        StaticTest.count = count;
    }
}
