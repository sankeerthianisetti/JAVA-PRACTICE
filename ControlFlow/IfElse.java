import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Given number is EVEN");
        } else {
            System.out.println("Given number is ODD");
        }

        sc.close();
    }
}