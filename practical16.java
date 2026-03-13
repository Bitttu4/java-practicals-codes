// Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the numbers, display the numbers.
import java.util.Scanner;
public class practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Original numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }        
        reverseArray(numbers);
        
        System.out.println("The reversed numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
    
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
    }
}
