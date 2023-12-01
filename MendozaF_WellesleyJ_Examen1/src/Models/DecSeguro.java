/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jellz
 */
public class DecSeguro extends DecEmpleado
{
    
    public DecSeguro(Empleado empleado) {
        super(empleado);
    }

    @Override
    public double getPagoEmpleado() {
        return super.getPagoEmpleado()-30; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
