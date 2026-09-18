import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // Keep asking input until user enters a positive number
        do {
            System.out.print("Enter a positive number (greater than 0): ");
            number = sc.nextInt();
        } while (number <= 0);

        System.out.println("Thank you! You entered a valid number: " + number);

        sc.close();
    }
}