/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class EmpleadoTiempoParcial implements Empleado
{
   int horas;
    double pago;
    int horasRestantes;
    public EmpleadoTiempoParcial(int horas)
    {
        this.horas=horas;
      
    }

    @Override
    public String getTipoEmpleado() 
    {
        return "Tiempo Parcial";
    }

     @Override
    public double getHoras() 
    {
        return horas;
    }
   @Override
    public double getPagoEmpleado() {
        if (horas<=10)
        {
            pago=horas*1.5;
        }
        else if (horas<=10)
        {
            pago=10*1.5;
            horasRestantes=horas-10;
        }
        return pago;
    }
    @Override
    public double getHorasRestantes() {
        return horasRestantes;
    }

   
    
}
