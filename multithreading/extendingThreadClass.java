package multithreading;

public class extendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // objects are made
        firstTask t1 = new firstTask();
        secondTask t2 = new secondTask();
        thirdTask t3 = new thirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (Thread.currentThread().getName()),(endTime - startTime));
    }
}
