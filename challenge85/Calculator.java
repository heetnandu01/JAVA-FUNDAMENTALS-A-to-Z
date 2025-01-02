/*
In a class calculator ,create multiple add() methods that overload each other and can sum two integers,three integers or two doubles.demonstarte how each can be called with different numbers of parameters
 */

class Calculator {

    public static int add(int a , int b){
        return a + b;
    }

    public static int add(int a, int b , int c){
        return a + b + c;
    }


    public static double add(double a, double b){
        return a + b;
    }

    public static int add(int a, int b , int c, int d){
        return a + b + c + d;
    }


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sum = Calculator.add(3,4);
        System.out.println(add(10, sum));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, sum));
        System.out.println(add(20.2, 40.4));
        System.out.println(add(20.4, sum));
        System.out.println(add(10, 20,30,sum));
    }
}
