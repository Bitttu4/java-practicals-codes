// Write a program to list all the files in the given directory, and list all the file attributes
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class practical36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the directory path: ");
        String dirPath = sc.nextLine();
        
        File directory = new File(dirPath);
        
        // Check if the given path exists and is indeed a directory
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            
            if (files != null && files.length > 0) {
                System.out.println("\nFiles and directories inside: " + dirPath);
                System.out.println("===================================================");
                for (File file : files) {
                    System.out.println("Name         : " + file.getName());
                    System.out.println("Path         : " + file.getAbsolutePath());
                    System.out.println("Size         : " + file.length() + " bytes");
                    System.out.println("Is Directory : " + file.isDirectory());
                    System.out.println("Readable     : " + file.canRead());
                    System.out.println("Writable     : " + file.canWrite());
                    System.out.println("Executable   : " + file.canExecute());
                    System.out.println("Hidden       : " + file.isHidden());
                    System.out.println("Last Modified: " + new Date(file.lastModified()));
                    System.out.println("---------------------------------------------------");
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path, or it does not exist.");
        }
        
        sc.close();
    }
}
