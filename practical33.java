// Write a program to implement linked list using collection class
import java.util.LinkedList;
public class practical33 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
         list.addFirst("Welcome"); // Adds to the beginning of the list
        list.addLast("Programming"); // Adds to the end of the list
        
        System.out.println("Linked List: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last elements: " + list);

        System.out.println("Iterating through the remaining list:");
        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}