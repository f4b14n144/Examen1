/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import java.util.HashMap;
import java.util.List;
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
         Reader fr = new Reader(1);
        List<String> attributes = fr.leerArchivo();

            String nombre = attributes.get(0);
            String tipoEmpleado = attributes.get(1);
            int minutos = Integer.parseInt(attributes.get(2));
            double minutosExtras = Double.parseDouble(attributes.get(3));
            String seguroMedico = attributes.get(4);
            int bonificaciones = Integer.parseInt(attributes.get(5));
            
            System.out.println(tipoEmpleado);
            System.out.println(minutos);
            System.out.println(minutosExtras);
            int horas=minutos/60;
            Empleado empleado=new EmpleadoTiempoCompleto(horas);
            
            Empleado seguroEmpleado=new DecSeguro(empleado);
            //el sout de aqui abajo es lo que posiblemente se tenga que escribir en el archivo 
            //dependiendo de lo que quiera la profe porque habria que escribir el sueldo final 
            //luego de seguro bonificaciones y etc.
            System.out.println(seguroEmpleado.getPagoEmpleado());
    }
}    
        
  
        
        
       
       
   

        
  

