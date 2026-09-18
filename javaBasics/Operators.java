public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("Addition (a + b): " + (a+b));
        System.out.println("Subtraction (a - b): " + (a-b));
	System.out.println("Multiplication (a * b): "+(a*b));
	System.out.println("Divison (a / b): "+(a/b));
	System.out.println("Modulus (a % b): "+(a%b));

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("Is 'a' greater than 'b'? " + (a > b));
        System.out.println("Is 'a' equal to 'b'? " + (a == b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\n--- Logical Operators ---");
        System.out.println("AND (x && y): " + (x && y));
        System.out.println("OR  (x || y): " + (x || y));
        System.out.println("NOT (!x): " + (!x));
    }
}