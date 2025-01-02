package methodoverriding;

public class test {
    public static void main(String[] args) {
        // parent class reference to child class object
        vehicle mybike = new bike();
        mybike.run();
    }
}
