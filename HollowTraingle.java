public class HollowTraingle {
        public static void main(String[] args) {
            int rows = 7;
    
            // Outer loop for rows
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
    
                // Print the first number
                System.out.print(i);
    
                // Print spaces or the second number
                if (i > 1) {
                    for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(i); // Print the second number
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    }