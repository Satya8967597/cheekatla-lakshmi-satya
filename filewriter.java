package javaio;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
   
    public static void main(String[] args) {
        
        String fileName = "output.txt";
        
  
        String content = "Hello, this is a sample text written to a file using FileWriter in Java.";
        
       
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

    

