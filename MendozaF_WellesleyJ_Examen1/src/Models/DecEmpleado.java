/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class DecEmpleado implements Empleado
{
    
    String Nombre;
   
     Empleado empleado;
     
     public DecEmpleado(Empleado empleado)
     {
         this.empleado=empleado;
     }
     
     
    @Override
    public String getTipoEmpleado() 
    {
        
        return empleado.getTipoEmpleado();
    }

     @Override
    public double getHoras() 
    {
       return empleado.getHoras();
    }
    
    @Override
    public double getPagoEmpleado() 
    {
        return empleado.getPagoEmpleado();
    }

    @Override
    public double getHorasRestantes() {
        double horas = empleado.getHoras();
        double horasRestantes = horas - 10;
        return horasRestantes;
    }

    @Override
    public String getNombre() {
        
        return Nombre;
    }
    
}

   
    
