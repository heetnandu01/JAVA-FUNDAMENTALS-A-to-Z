package challenge83;

public class Circle extends shape{
    private final double radiusInCms;

    public Circle(double radiusInCms){ // constructor
        this.radiusInCms = radiusInCms;
    }
    
    // getter of Circle 

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms,2);
    }
}