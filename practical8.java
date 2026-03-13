// Program to count how many words start with a capital letter in a string.
import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Add a space at the beginning to make checking the first word easier
        String str2 = " " + str;

        int count = 0;

        for (int i = 0; i < str2.length() - 1; i++) {
            // If current char is space and next char is a capital letter
            if (str2.charAt(i) == ' ') {
                char next = str2.charAt(i + 1);
                if (next >= 'A' && next <= 'Z') {
                    count++;
                }
            }
        }

        System.out.println("Number of words starting with capital letter: " + count);

        sc.close();
    }
}
