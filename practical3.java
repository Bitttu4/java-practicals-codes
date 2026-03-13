import java.util.Scanner;
public class practical3
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        float tall; // taking input in meter
        System.out.print("Enter height in meter :");
        tall = sc.nextFloat();
        // converting meter in inches 
        tall = tall * 39.370f;
        // converting inches to feet
        tall = tall /12;
        System.out.print("Height in feet ="+tall);
        sc.close();
    }
}