package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readtext {
     public static void main(String[] args) {
        String filePath = "example.txt"; 

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             InputStreamReader isr = new InputStreamReader(bis);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    

 
    

