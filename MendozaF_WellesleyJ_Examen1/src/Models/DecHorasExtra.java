/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class DecHorasExtra extends DecEmpleado
{
    
    public DecHorasExtra(Empleado empleado) {
        super(empleado);
    }
   public double sacarPago() {
    double pago = 0.0;
    double horas = empleado.getHoras();
    String tipo = empleado.getTipoEmpleado();
    
    if (tipo.equalsIgnoreCase("Tiempo Completo")) {
        if (horas <= 10) {
            pago = horas * 1.50;
        } else {
            double horasExtras = horas - 10;
            pago = 10 * 1.50 + horasExtras * 0.75;
        }
    } else if (tipo.equalsIgnoreCase("Tiempo Parcial")) {
        double horasRestantes = empleado.getHorasRestantes(); 
        pago = horasRestantes * 0.50;
    }
    
    return pago;
}

    @Override
    public double getPagoEmpleado()
    {
        double pago=sacarPago();
        return super.getPagoEmpleado()+pago; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  
    
}
