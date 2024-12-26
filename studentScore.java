import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        System.out.println("Student Score");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = input.nextInt();
        String result =  score > 80 ? "High" : (score > 50 ? "moderate": "low");
        System.out.println(result);
    }
}
