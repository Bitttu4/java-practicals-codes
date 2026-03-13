// Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number. 
import java.util.Random;
import java.util.Scanner;
public class practical12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String plateNumber = "";
        
        // Generate three uppercase letters
        for (int i = 0; i < 3; i++) {
            char letter = (char) (rand.nextInt(26) + 'A');
            plateNumber += letter;
        }
        
        // Generate four digits
        for (int i = 0; i < 4; i++) {
            int digit = rand.nextInt(10);
            plateNumber += digit;
        }
        
        System.out.println("Generated Plate Number: " + plateNumber);
        
        sc.close();
    }
}
