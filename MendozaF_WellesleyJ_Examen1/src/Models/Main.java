/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
            System.out.println(nombre);
            System.out.println(tipoEmpleado);
            System.out.println(minutos);
            System.out.println(minutosExtras);
            int horas=minutos/60;
           
          Empleado empleado=new EmpleadoTiempoCompleto(horas);
           if( empleado.getHorasRestantes()!=0)
          {
               Empleado horasExt=new DecHorasExtra(empleado);
          }
           System.out.println(seguroMedico);
            Empleado seguroEmpleado=new DecSeguro(empleado);
            
        /*    
            System.out.println(seguroEmpleado.getPagoEmpleado()+ " "+ seguroEmpleado.getTipoEmpleado()+ " " +seguroEmpleado.getHoras()+" "+nombre+" "+seguroMedico);
            try (FileWriter fileWriter = new FileWriter("src\\Models\\Sueldos.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

                
           printWriter.println(
                   nombre + " " +
                   seguroEmpleado.getTipoEmpleado() + " " +
                  seguroEmpleado.getPagoEmpleado()+ " " +
                   seguroEmpleado.getSueldoHorasExtras() + " " +
                   (seguroEmpleado.getSeguroMedico() != null ? seguroEmpleado.getSeguroMedico() : "NO") + " " +
                   (seguroEmpleado.getBonificaciones() > 0 ? seguroEmpleado.getBonificaciones() : "NO") + " " +
                   seguroEmpleado.getSueldoFinal()
           );

           System.out.println("Detalle de empleados escritos en Sueldos.txt satisfactoriamente.");

       } catch (IOException e) {
           System.out.println("Error writing to Sueldos.txt: " + e.getMessage());
           e.printStackTrace();
       }
            // de aqui para abajo habria que crear el resto de empleados
            // para eso se instancia de nueco a reader y se crea una lista nueva con las cosas de cada empleado
            //no se si sea lo adecuado pero la dory no pidio singleton asi que chill
    }
*/
        
         Reader fr1 = new Reader(3);
        List<String> attributos1 = fr1.leerArchivo();

            String nombre1 = attributes.get(0);
            String tipoEmpleado1 = attributes.get(1);
            int minutos1 = Integer.parseInt(attributes.get(2));
            double minutosExtras1 = Double.parseDouble(attributes.get(3));
            String seguroMedico1 = attributes.get(4);
            int bonificaciones1 = Integer.parseInt(attributes.get(5));
            System.out.println(nombre1);
            System.out.println(tipoEmpleado1);
            System.out.println(minutos1);
            System.out.println(minutosExtras1);
            int horas1=minutos1/60;
            
}    
    }

        
  
        
        
       
       
   

        
  

