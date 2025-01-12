package multithreading;

public class thirdTask extends Thread {
    @Override
    public void run() {
        // third task
        for(int i = 1; i<= 10;i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task complete");
    }
}
