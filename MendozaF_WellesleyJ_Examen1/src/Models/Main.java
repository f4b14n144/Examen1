/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import java.util.Map;


/**
 *
 * @author fabia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Reader rf = new Reader();
        Map<String, String> variables = rf.leerArchivo();
        
                 // Access other variables as needed
        String tipo = variables.get("Tipo empleado");
        String nombre = variables.get("Nombre");
        String minutos = variables.get("minutos");
        String minutosExtra = variables.get("minutos extras");
        String seguroMedico = variables.get("seguro médico");
        String bonificaciones = variables.get("bonificaciones");

        
        // Use the variables as needed
        System.out.println("Tipo empleado: " + tipo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Minutos: " + minutos);
        System.out.println("Minutos Extras: " + minutosExtra);
        System.out.println("Seguro Médico: " + seguroMedico);
        System.out.println("Bonificaciones: " + bonificaciones);

      
    }
        
        
       
       
   

        
     
}
