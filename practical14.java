// Write a program that reads an integer and displays all its smallest factors in increasing order. For example, if input number is 120, the output should be as follows:2,2,2,3,5. 
import java.util.Scanner;
public class practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");// taking input for integer
        int number = sc.nextInt();
        
        System.out.print("The smallest factors are: ");
        int factor = 2;
        boolean first = true;
        
        for (factor = 2; number > 1; ) {
            if (number % factor == 0) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(factor); break; } else {
                factor++;
            }
        }
        System.out.println();
        sc.close();
    }
}
