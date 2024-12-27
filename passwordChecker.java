import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to set your password");
        String password;
        do{
            System.out.print(" Enter your password: ");
            password = input.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");

    }


    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
