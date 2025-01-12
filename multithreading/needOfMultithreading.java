package multithreading;

public class needOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // First task
        for(int i = 1; i<= 1000;i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task complete");

        // second task
        for(int i = 1 ; i<= 10;i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task complete");

        // third task
        for(int i = 1; i<= 10;i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task complete");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime));
    }
}
