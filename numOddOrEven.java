import java.util.Scanner;

public class numOddOrEven {
    public static void main(String[] args) {
        System.out.println("Number is odd or even");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num  = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println(result);
    }
}
