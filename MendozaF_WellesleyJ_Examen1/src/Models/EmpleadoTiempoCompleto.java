/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class EmpleadoTiempoCompleto implements Empleado
        
{
    double pago;
    int horas;
    int horasRestantes;
    public EmpleadoTiempoCompleto(int horas )
    {

        this.horas=horas;
    }

    @Override
    public String getTipoEmpleado() {
        return "Tiempo Completo";
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
    public double getHoras() 
    {
        return horas;
    }

    @Override
    public double getHorasRestantes() {
        return horasRestantes;
    }
    
        
}
