/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jellz
 */
public class Reader {
   int linea;
 
   

public Map<String, String> leerArchivo() {
        Map<String, String> variablesMap = new HashMap<>();
        String filePath = "src/Models/Empleados.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));

            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Assuming the variables are in order: Nombre, Tipo empleado, minutos, minutos extras, seguro médico, bonificaciones
                if (lineNumber == 2) {
                    String[] words = line.split(",");

                    // Define variable names
                    String[] variableNames = {"Nombre", "Tipo empleado", "minutos", "minutos extras", "seguro médico", "bonificaciones"};

                    // Store each variable with its name in the map
                    for (int i = 0; i < words.length; i++) {
                        variablesMap.put(variableNames[i], words[i].trim());
                    }

                       /* String tipo = variablesMap.get("Tipo empleado");
                        String nombre = variablesMap.get("Nombre");
                        String minutos = variablesMap.get("minutos");
                        String minutosExtra = variablesMap.get("minutos extras");
                        String seguroMedico = variablesMap.get("Seguro médico");
                        String bonificaciones = variablesMap.get("bonificaciones");
                        */
                    break;
                    
                }
                

                lineNumber++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return variablesMap;
    }
}
