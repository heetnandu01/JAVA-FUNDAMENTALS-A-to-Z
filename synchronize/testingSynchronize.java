package synchronize;

public class testingSynchronize {
    public static void main(String[] args) {
        long startTime  = System.currentTimeMillis();
        counter counter = new counter();
        updaterThread t1 = new updaterThread(counter);
        updaterThread t2 = new updaterThread(counter);

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("final counter value: %d and time taken: %d",counter.getCount(),(endTime - startTime));
    }
    
}
