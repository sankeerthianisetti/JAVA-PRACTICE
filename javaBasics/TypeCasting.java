public class TypeCasting {
    public static void main(String[] args) {
        // Implicit(Small to Large)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Implicit Casting:");
        System.out.println("Original int value: " + myInt);
        System.out.println("Converted double value: " + myDouble);

        // Explicit(Large to Small)
        double pi = 3.14159;
        int roundedPi = (int) pi; // Manual casting: double to int

        System.out.println("\nExplicit Casting:");
        System.out.println("Original double value: " + pi);
        System.out.println("Converted int value: " + roundedPi);
    }
}