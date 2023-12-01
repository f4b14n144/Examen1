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
    double horas;
    
    public EmpleadoTiempoCompleto(double pago,double horas)
    {
        this.pago=pago;
        this.horas=horas;
    }

    @Override
    public String getTipoEmpleado() {
        return "Tiempo Completo";
    }

    @Override
    public double getPagoEmpleado() {
        return pago;
    }

    @Override
    public double getHoras() 
    {
        return horas;
    }

    @Override
    public double getHorasRestantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
}
