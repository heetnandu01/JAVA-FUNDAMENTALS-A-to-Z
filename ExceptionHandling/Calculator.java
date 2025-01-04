package ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator\n");
        System.out.print("Enter Your two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            int [] a = new int[5];
            System.out.printf("Result is %d",a[6]); 
            a[6] = num1/num2;
            System.out.printf("Result is %d",a[6]);
        } catch(ArithmeticException exception){
            System.out.printf("%s ,enter valid values", exception.getMessage());
        }catch (Throwable th){
            System.out.println("General Exception");
            throw th;
        } finally{
            System.out.println("I am in finally");
        }
    }   
}


