package inheritance;

public class twoWheeler extends vehicle {
    twoWheeler(){
        setnumberofTires(2);
        numberOfTires = 4;
    }


    public void balance(){
        System.out.println("I am balancing on two tires ");
    }
}
