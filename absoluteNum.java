import java.util.Scanner;

public class absoluteNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to absolute numbers");
        System.out.print("Enter num1: ");
        int num = input.nextInt();
        int result = num >=0 ? num : -num;
        System.out.println("the absolute number is " + result);
    }
}
