/**
 * Created by ICT LAB PC on 5/10/17.
 */
public class PrintThreadDemo {

    public static void main(String[] args)  {
        Runnable printNumber = new PrintNumber(10,10);
        Runnable printCharacter = new PrintCharacter(10,'A');

        Thread printNumberThread = new Thread(printNumber);
        Thread printCharacterThread = new Thread(printCharacter);


       printCharacterThread.setPriority(Thread.NORM_PRIORITY);
        printNumberThread.setPriority(Thread.MIN_PRIORITY);
        if (printNumberThread.getPriority() < printCharacterThread.getPriority())
        {
            printNumberThread.start();

        }
        printCharacterThread.start();

    }
}
