// Write  the  bin2Dec  (string  binary  String) method  to  convert  a  binary  string  into  a decimal  number.  Implement  the  bin2Dec method to throw a NumberFormatException if the string is not a binary string.
import java.util.Scanner;

public class practical31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = sc.nextLine();
        
        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("The decimal equivalent of " + binaryString + " is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        sc.close();
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new NumberFormatException("Not a binary string: " + binaryString);
            }
            decimal = decimal * 2 + (ch - '0'); // Shift left by 1 (multiply by 2) and add the current bit
        }
        return decimal;
    }
}
