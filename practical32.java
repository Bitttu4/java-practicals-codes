//Write  a  program  to  generate  customized exception named ArgumentGreaterThanOne if there is more than one argument in command line

class ArgumentGreaterThanOne extends Exception {
    public ArgumentGreaterThanOne(String message) {
        super(message);
    }
}
public class practical32 {
    public static void main(String[] args) {
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOne("More than one argument provided. Please provide only one argument.");
            } else if (args.length == 0) {
                System.out.println("No arguments provided. Please provide one argument.");
            } else {
                System.out.println("Argument provided: " + args[0]);
            }
        } catch (ArgumentGreaterThanOne e) {
            System.out.println(e.getMessage());
        }
    }
}