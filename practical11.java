import java.util.Random;

public class practical11
{
    public static void main(String[] args) 
{
        Random r = new Random();
        System.out.println("First 100 random integers between 1 and 49:");
        for (int i = 1; i <= 100; i++) 
	{
            int num = r.nextInt(49) + 1;
            System.out.print(num + "\t");
        }
    }
}
