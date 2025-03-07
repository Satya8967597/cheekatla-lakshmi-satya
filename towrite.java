package javaio;

import java.io.FileOutputStream;
import java.io.IOException;

public class towrite {
     public static void main(String[] args) {
        String text = "Hello, this is a sample text written to a file using OutputStream in Java.";
        String filePath = "output.txt";
        
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(text.getBytes());
            System.out.println("Text has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

    

