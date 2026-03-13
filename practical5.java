// wrp to find maximum number out if three number 
import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        
        System.out.print("Number 3: ");
        int num3 = sc.nextInt();
        
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        System.out.println("\nMaximum number is: " + max);
        sc.close();
    }
}