package javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class toread {
     public static void main(String[] args) {
        String filePath = "example.txt"; 
        
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

    

