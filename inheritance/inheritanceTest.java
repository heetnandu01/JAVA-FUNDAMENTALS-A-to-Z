package inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.commute();
        twoWheeler two = new twoWheeler();
        two.commute();
        two.balance();

        motorCycle motor = new motorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
