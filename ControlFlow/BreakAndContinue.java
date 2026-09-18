public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Loop from 1 to 10 (Skip 5 using continue, Stop at 8 using break):");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("[Skipped 5]");
                continue; // Skips current iteration
            }
            if (i == 8) {
                System.out.println("[Stopping loop at 8]");
                break; // Terminates the loop completely
            }
            System.out.println("Number: " + i);
        }
    }
}