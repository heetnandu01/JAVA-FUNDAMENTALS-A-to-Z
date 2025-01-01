package challenge83;

public class testShapes {
    public static void main(String[] args) {
        //shape shape = new shape();
        Circle Circle = new Circle(5);
        square square = new square(10.3);
        /*
         by putting 5.2 in the print statement it will reduce the digitsafter points and will give only two digits 
         for eg we get output of 66.546354674
         by putting 5.2f in print statement it will give the output as 66.54
        */
    
        System.out.printf("Area of circle is %5.2f\n", Circle.calculateArea());
        System.out.printf("Area of square is %5.2f", square.calculateArea());
        
    }
}

