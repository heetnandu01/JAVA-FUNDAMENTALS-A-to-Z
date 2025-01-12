package multithreading;

public class secondTask extends Thread {
    @Override
    public void run() {
        // second task
         for(int i = 1 ; i<= 10;i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task complete");
    }
}
