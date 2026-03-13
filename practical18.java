//Write a program to sort the elements from given array of integer. Specify size of array and elements of array from command line argument. 
/*yaha terminal me run karte vakt value deni hogi using command line arguments and usme
like jo pehla term hoga voh size ko hold karega jese agar 5 dala hai terminal m first time to voh uska size hoga 
uske bad sare terms add karne hai and ek ek karke karna hai for eg
java practical18 5 10 30 20 50 40 // yeh ek sample run hai jisme 5 size hai aur uske bad ke sare terms array me add honge aur sort honge
yaha jo 5 hai voh size hai jo hume hi define karni padegi and usme hisab se input dene ka hoga
yahah hum input lene ke liye args use karenge joh humm main me add karte hai but string data type hone ki vajah se usko cast karna pade */
import java.util.Arrays; // Importing the Arrays class for sorting the array 
// iski jagah koi bhi sorting algorithm use kar sakte hai but yaha humne Arrays.sort() method ka use kiya hai jo ki built-in method hai java me jo array ko sort kar deta hai
public class practical18 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the size of the array and its elements as command line arguments.");
            return;
        }

        int size = Integer.parseInt(args[0]); // First argument is the size of the array
        int[] array = new int[size]; // using parse for converting string to integer

        // Parse the remaining arguments to fill the array
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(args[i+1]); // Parsing each element from the command line arguments and storing it in the array
        }

        Arrays.sort(array);

        System.out.println("size of array: " + size);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
