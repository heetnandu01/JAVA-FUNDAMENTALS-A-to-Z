package inheritance;

public class vehicle {
    // private int numberOfTires;
    int numberOfTires;
    // if we use public  class we do not have to make a setter 
    // if we use private class we do have make a setter
    // if we do not use any access modifier it will be default modifier and 

    public void setnumberofTires(int numberOfTires){
        this.numberOfTires = numberOfTires;
    }

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}
