// Write a program to generate customized exception named ArgumentGreaterThanOne if there is more than one argument in command line

// Custom exception class
class ArgumentGreaterThanOne extends Exception {
    public ArgumentGreaterThanOne(String message) {
        super(message);
    }
}

public class practical30 {
    public static void main(String[] args) {
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOne("More than one argument is not allowed!");
            } else if (args.length == 1) {
                System.out.println("Successfully provided exactly 1 argument: " + args[0]);
            } else {
                System.out.println("No arguments were provided. (0 arguments)");
            }
        } catch (ArgumentGreaterThanOne e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
