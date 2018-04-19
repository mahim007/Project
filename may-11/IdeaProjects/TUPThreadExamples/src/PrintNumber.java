/**
 * Created by ICT LAB PC on 5/10/17.
 */
public class PrintNumber implements Runnable {
    private int times;
    private int numberToPrint;

    public PrintNumber(int times, int numberToPrint) {
        this.times = times;
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
     for (int i=1; i<=times;i++)
     {

         for (int j=1; j<=times; j++)
         {
         System.out.print(numberToPrint+" ");
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
       }
         System.out.print("\n");
     }
        System.out.print("Priority of PrintNumberThread:"+Thread.currentThread().getPriority());
    }
}
