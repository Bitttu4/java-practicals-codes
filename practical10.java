import java.util.Scanner;

public class practical10{
     public static void main(String[] args)
     {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter a string:");
         String str= sc.nextLine();
         int len= str.length();
         for(int i = 0;i<len;i++){
             for(int j=0; j< len-i-1; j++)
             {
                 System.out.print(" ");
             }
             for(int k=0; k<=i; k++)
             {
                 System.out.print(str.charAt(k) + " ");
             }
             System.out.println();
         }
     }
}