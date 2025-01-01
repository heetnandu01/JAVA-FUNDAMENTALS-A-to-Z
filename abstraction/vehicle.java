package abstraction;

public abstract class vehicle implements transport  {

    private int noOfTires;


    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("going to place....");
    }
    

    public vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println("going..");
    }
}
