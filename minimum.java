import java.util.Scanner;

// minimum of two numbers
 
public class minimum {
    public static void main(String[] args) {
        System.out.println("Minimum of two numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        int minimum_number = num1 < num2 ? num1 : num2;
        System.out.println("Minimum nuner is " + minimum_number);
    }
}
