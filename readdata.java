package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdata {
     public static void main(String[] args) {
        // Specify the path to the properties file
        String propertiesFilePath = "config.properties";
        
        // Create a Properties object
        Properties properties = new Properties();
        
        // Load the properties file
        try (FileInputStream fileInput = new FileInputStream(propertiesFilePath)) {
            properties.load(fileInput);
            
            // Read properties
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            
            // Print properties
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);
        } catch (IOException e) {
            System.err.println("Error reading the properties file: " + e.getMessage());
        }
    }
}

    

