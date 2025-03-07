package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class generateioexcep {
    public static void main(String[] args) {

        File file = new File("wiuoe.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read();
            fis.close();
        }
  
        catch (IOException e) {
           
            e.printStackTrace();
        }
    }
}
    

