/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jellz
 */
public class DecBonificaciones extends DecEmpleado
{
    int bonificaciones;
    public DecBonificaciones(Empleado empleado,int bonificaciones) {
        super(empleado);
        this.bonificaciones=bonificaciones;
    }
public double getBonificaciones()
{
    String tipo = empleado.getTipoEmpleado();
    double bonificacion = 0.0;

    if (tipo.equalsIgnoreCase("Tiempo Completo")) {
        int multipleOfThree = bonificaciones / 3;
        int remainingBonificaciones = bonificaciones % 3;

        bonificacion = multipleOfThree + (remainingBonificaciones * 0.40);
    } else if (tipo.equalsIgnoreCase("Tiempo Parcial")) {
        int multipleOfTwo = bonificaciones / 2;
        int pendingBonificaciones = bonificaciones % 2;

        bonificacion = multipleOfTwo + pendingBonificaciones;
    }

    return bonificacion;

}
    @Override
    public double getPagoEmpleado() 
    {
        double bonificacion=getBonificaciones();
        return super.getPagoEmpleado()+bonificacion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
