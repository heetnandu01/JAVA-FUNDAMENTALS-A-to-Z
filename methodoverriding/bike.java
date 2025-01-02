package methodoverriding;

class bike extends vehicle {
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}
