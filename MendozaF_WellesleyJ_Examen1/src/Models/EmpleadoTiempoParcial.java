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
    double horas;
    double pago;
    public EmpleadoTiempoParcial(double horas,double pago)
    {
        this.horas=horas;
        this.pago=pago;
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
        return pago;
    }

    @Override
    public double getHorasRestantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
