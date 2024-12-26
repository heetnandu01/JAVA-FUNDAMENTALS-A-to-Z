import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("the Classic calculator game");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println(" Select  an operator");
        String operator = input.next();
        
        int result = switch(operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };

        System.out.println("Your answer is " + result);
   
    }
}
