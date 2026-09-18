import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int count = 3;

        // Prints the number and increments it 3 times
        while (count > 0) {
            System.out.println(a);
            a++;
            count--; // Decrement count to stop the loop after 3 times
        }

        sc.close();
    }
}