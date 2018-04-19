public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int i = 0, j = 10;
            int k = j / i;
            System.out.println("K is :"+k);
        }

        catch(ArithmeticException ae){
            System.out.println("diving by zero");
        }

    }
}
