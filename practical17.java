//Write a program that generate 6*6 two dimensional matrix, filled with 0’s and 1’s , display the matrix, check every raw and column have an odd number’s of 1’s. 
import java.util.Random;
public class practical17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random rand = new Random();
        
        // Fill the matrix with random 0's and 1's
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = rand.nextInt(2); // Generates either 0 or 1
            }
        }
        
        // Display the matrix
        System.out.println("Generated Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Check rows and columns for odd number of 1's
        boolean valid = true;
        
        // Check rows
        for (int i = 0; i < 6; i++) {
            int countOnes = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 == 0) { // Even number of 1's
                valid = false;
                break;
            }
        }
        
        // Check columns if rows are valid
        if (valid) {
            for (int j = 0; j < 6; j++) {
                int countOnes = 0;
                for (int i = 0; i < 6; i++) {
                    if (matrix[i][j] == 1) {
                        countOnes++;
                    }
                }
                if (countOnes % 2 == 0) { // Even number of 1's
                    valid = false;
                    break;
                }
            }
        }
        
        if (valid) {
            System.out.println("Every row and column has an odd number of 1's.");
        } else {
            System.out.println("Not every row and column has an odd number of 1's.");
        }
    }
    
}
