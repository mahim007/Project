/**
 * Created by ICT LAB PC on 5/10/17.
 */
public class PrintCharacter implements Runnable {
    private int time;
    private char charToPrint;



    public PrintCharacter(int time, char charToPrint) {
        this.time = time;
        this.charToPrint = charToPrint;
    }

    @Override
    public void run() {

        for (int i=1; i<= time; i++)
        {

            System.out.print(charToPrint + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("Priority of PrintCharacterThread:"+Thread.currentThread().getPriority());

    }
}
