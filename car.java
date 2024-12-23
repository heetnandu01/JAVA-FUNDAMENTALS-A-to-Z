public class car {

    // this are all instance variables 

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLitres;

    int noOfSeats;

    car(String color){ // default constructor
        this.color = color;
        noOfSeats = 6;
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLitres = 2;
    }

    // this is are called instance methods  
    public car start(){
        if(currentFuelInLitres == 0){
            System.out.println("car is out of fuel cannot start");
        }else if (currentFuelInLitres < 5){
            System.out.println("car is in reserved mode, please refuel");
        }else{
            System.out.println("car is started ");
        }
        return this;
    }

    public void drive(){
        currentFuelInLitres--;
        System.out.println("car is driving");
    }

    public void addFuel(float currentFuelInLitres){
       this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }


}
