// Write a program that prompts the user to enter a decimal number and displays the number in a fraction. 
import java.util.Scanner;
public class practical13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();
        
        // Convert the decimal number to a fraction
        int denominator = 1;
        while (decimalNumber % 1 != 0) {
            decimalNumber *= 10;
            denominator *= 10;
        }
        
        int numerator = (int) decimalNumber;
        
        // Simplify the fraction
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        
        System.out.println("The fraction representation is: " + numerator + "/" + denominator);
        
        sc.close();
    }
    
    // Function to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }    
}
