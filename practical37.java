//Write a program to copy the content of one file to another file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class practical37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the source file path: ");
        String sourceFile = sc.nextLine();
        
        System.out.print("Enter the destination file path: ");
        String destFile = sc.nextLine();
        
        // Using try-with-resources to automatically close the streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            // Read from source and write to destination in chunks of 1024 bytes
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
        
        sc.close();
    }
}