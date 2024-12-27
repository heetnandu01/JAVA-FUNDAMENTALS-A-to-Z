import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5,guess;
        System.out.println("welcome to number guessing game");
        do{
            System.out.print("Enter the number between 1 to 10 : ");
            guess = input.nextInt();
        }while( num != guess);
        System.out.println("You have Successfully guessed the number");
    }
}
