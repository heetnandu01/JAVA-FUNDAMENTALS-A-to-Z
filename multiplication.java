import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to printing tables");
        System.out.print("Enter the number of table you want to print: ");
        int num = input.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(num + " X " + i + " = " +(num * i));
        }
    }
}
