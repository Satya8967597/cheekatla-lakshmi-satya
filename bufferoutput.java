package javaio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferoutput {
     public static void main(String[] args) {
        String filePath = "output.txt"; 
        String content = "Hello, this is a test using BufferedOutputStream in Java!";

        try (FileOutputStream fos = new FileOutputStream(filePath);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

          
            bos.write(content.getBytes());

          
            bos.flush();

            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

