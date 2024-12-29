import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("your number is " + (isprime(num) ? "prime":"not prime"));
    }

    public static boolean isprime(int num){
        return false;
    }
}
