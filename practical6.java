// wrp to find whether the character is vowel or consonant.
import java.util.Scanner;
public class practical6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
        {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                System.out.println(ch + " is a Vowel.");
            } 
            else 
            {
                System.out.println(ch + " is a Consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}
