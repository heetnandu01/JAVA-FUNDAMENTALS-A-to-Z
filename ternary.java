import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        // int greaterNumber;
        // if(num1 > num2){
        //     greaterNumber = num1;
        // }else{
        //     greaterNumber = num2;
        // }
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the  greatest number ");
    }
}

