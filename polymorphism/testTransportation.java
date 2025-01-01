package polymorphism;

public class testTransportation {
    public static void main(String[] args) {
        car c = new car();
        vehicle v = new vehicle();
    
        vehicle vcar = new car();
    
        car cvehicle =(car) new vehicle();

        Object ref = new car();
    }
}
