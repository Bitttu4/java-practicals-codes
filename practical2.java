import java.util.Scanner;
public class practical2
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        float tall,fat; // taking input in inches ad pounds
        System.out.print("Enter height in inches :");
        tall = sc.nextFloat();
        System.out.print("Enter weight in pounds :");
        fat = sc.nextFloat();
        tall = tall * 0.0254f; 
        fat = fat * 0.45359f;
        float bmi;
        bmi = fat / (tall * tall);
        System.out.println("bmi ="+bmi);
        sc.close();
    }
}