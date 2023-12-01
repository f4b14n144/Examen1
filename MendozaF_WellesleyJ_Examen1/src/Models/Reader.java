/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jellz
 */
public class Reader {
    int linea;

    public Reader(int linea) {
        this.linea = linea;
    }

    public List<String> leerArchivo() {
        List<String> attributesList = new ArrayList<>();
        String filePath = "src/Models/Empleados.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));

            int lineNumber = linea;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Assuming the variables are in order: Nombre, Tipo empleado, minutos, minutos extras, seguro médico, bonificaciones
                if (lineNumber == 2) {
                    String[] words = line.split(",");

                    for (String word : words) {
                        attributesList.add(word.trim());
                    }

                    break;
                }

                lineNumber++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return attributesList;
    }
}
