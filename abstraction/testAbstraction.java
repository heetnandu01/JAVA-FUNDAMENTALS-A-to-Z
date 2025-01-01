package abstraction;

public class testAbstraction {
    public static void main(String[] args) {
        // vehicle veh = new vehicle(2);
        car car = new car();
        car.commute();
        car.makeStartSound(); 
    }
}
