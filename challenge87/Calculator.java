package challenge87;

import java.util.Scanner;

/*
Write a program that asks the user to enter two integers and then divides the first by the second.the program should handle any arithmetic exceptions that may occur (like division by zero) and display an appropriate message
key points:
1.use Scanner to read user input.
2.implement a try-catch block to handle ArithmeticException.
3.Display a user-friendly message if division by zero occurs.
*/
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        System.out.print("Enter the num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = input.nextInt();
        try{
            int result  = num1/num2;
            System.out.printf("Result is %d",result);
        }catch(ArithmeticException exception){
            if(exception.getMessage().equals("Divide by zero")){
                System.out.println("Divide by zero occured");
            }else{
                throw exception;
            }
        }
    }
} 