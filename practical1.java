import java.util.Scanner;
public class practical1
{
    public static void main(String[] args)
    {
        float a, b, c, d, e, f, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE VALUES FOR EQUATION 1 :");
        System.out.println("e = ax + by");
        System.out.println("Enter the value of 'a' : ");
        a = sc.nextFloat();
        System.out.println("Enter the value of 'b' : ");
        b = sc.nextFloat();
        System.out.println("Enter the value of 'e' : ");
        e = sc.nextFloat();

        System.out.println("ENTER THE VALUES FOR EQUATION 2 : ");
        System.out.println("f = cx + dy");
        System.out.println("Enter the value of 'c' : ");
        c = sc.nextFloat();
        System.out.println("Enter the value of 'd' : ");
        d = sc.nextFloat();
        System.out.println("Enter the value of 'f' : ");
        f = sc.nextFloat();

        System.out.println("EQUATIONS YOU ENTERED ARE : ");
        System.out.println(e + " = " + a + "x + " + b + "y");
        System.out.println(f + " = " + c + "x + " + d + "y");

        p = ((a * d) - (b * c));
        if (p != 0)
        {
            System.out.println("SOLUTION :- ");
            double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
            System.out.println("x = " + x);
            double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
            System.out.println("y = " + y);
        }
        else
        {
        System.out.println("This equation has no solution !!! ");
        }
        sc.close();
    }
}



