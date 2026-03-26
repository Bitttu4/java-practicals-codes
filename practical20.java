//Write a program to implement the operation of stack using array
import java.util.Stack;
import java.util.Scanner;
public class practical20 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped value: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top value: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Stack elements: " + stack);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }    
}
