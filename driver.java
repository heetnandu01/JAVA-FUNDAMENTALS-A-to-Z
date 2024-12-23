public class driver {

    static int minAgeOfDriving = 18;

    String name;
    int age;
    String dateOfLicense;


    // In this non static instance method we accessed static 

    public boolean isAllowedToDrive(){
        return this.age > minAgeOfDriving;
    }
    public static void main(String[] args) {
        // car myCar = new car();
        // myCar.drive();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(3);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());


        car swift = new car("red");
        // swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);
        // car startedCar = swift.start();
        // startedCar.drive();


        // driver myDriver = new driver();
        // myDriver.dateOfLicense = "1/jab/2024";
        // System.out.println(minAgeOfDriving);
    }
}



