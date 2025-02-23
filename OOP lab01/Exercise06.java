public class Exercise05 {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
    
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }

            System.out.print("  ");

            for (int j = i; j < size; j++) {
                System.out.print("  "); // Spaces for alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*   "); // Stars with spacing
            }

            System.out.println(); // Move to the next line
        }
    }
}