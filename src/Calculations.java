import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        // variabls to take in the two integers numbers
        int num1 = 0;
        int num2 = 0;
        // Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("Enter another number: ");
        num2 = input.nextInt();
        System.out.println("\n\n\n");
        // print the result
        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Product : " + (num1 * num2));
    }
}
