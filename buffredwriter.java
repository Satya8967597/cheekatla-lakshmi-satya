package javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffredwriter {
     public static void main(String[] args) {
        String fileName = "output.txt";  
        String content = "Hello, this is a sample text written using BufferedWriter.";

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            writer.newLine();  
            writer.write("This is another line.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

    

