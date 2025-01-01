package challenge83;

public class square extends shape {

    private final double sideInCms;

    

    public square(double sideInCms) { // constructor
        this.sideInCms = sideInCms;
    }
    
    public double getSideInCms() { // getter
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }

    
}
