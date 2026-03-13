// wrp to find that the given of a string is palindrome or not.
import java.util.Scanner;
public class practical9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
       
        // Step 1: Wrap the string in a StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // Step 2: Call reverse() method
        sb.reverse();

        // Step 3: Convert back to String
        String reversedStr = sb.toString();

        
        if (str.equals(reversedStr)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }    
}
