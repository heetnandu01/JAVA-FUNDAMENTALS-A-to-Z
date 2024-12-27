import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("please enter your age: ");
        // int age = input.nextInt();
        // while (age < 0 || age > 100){
        //     System.out.print("please enter your age: ");
        //     age = input.nextInt();  
        // }
        int age  = -1;
        do{
            System.out.print("please enter your age: ");
            age = input.nextInt();
        }while(age < 0 || age > 100);
        System.out.println("Your age is: " + age);
    }
}
