package utils;

import geometry.circle;
import geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);
        rectangle rect = new rectangle(20, 10);

        double cirArea = Math.PI*Math.pow(cir.radius,2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of circle is: %s,Area of rectangle is: %s",cirArea,rectArea);
    }
}






