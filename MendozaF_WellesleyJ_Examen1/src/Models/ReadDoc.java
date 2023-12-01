/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fabia
 */
public class ReadDoc 
{
    public void readDocument()
        {
            String filePath="src/Models/Empleados.txt";
        try (FileReader fileReader = new FileReader(new File(filePath));
                   BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                  String line;
                  // Read each line from the file until the end
                  while ((line = bufferedReader.readLine()) != null) {
                      // Process each line as needed
                      System.out.println(line); // Example: Print each line to the console
                      // You can perform further processing of the line here
                  }
              } catch (IOException e) {
                  // Handle any potential exceptions that may occur while reading the file
                  e.printStackTrace();
              }
        }
    
    
}
