// wrp to find the lenght of the string and print the second half of the string.
import java.util.Scanner;
public class practical7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");        
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        String secondHalf = str.substring(length / 2);
        System.out.println("Second half of the string: " + secondHalf);
    }  
}
