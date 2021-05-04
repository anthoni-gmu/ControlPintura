package Model;

import Service.IFormula;
import javax.swing.JButton;

public class Formula  implements IFormula{

    @Override
    public double consumoTeorico(double area, double rendimiento) {
        return area/rendimiento;
    }

    @Override
    public double consumoPractico(double CT, double FA, double FR) {
        return CT*FA*FR;
    }

    @Override
    public double presupeto(double balde,double precio) {
        return balde*precio;
    }

    @Override
    public double FactorAplicacion(int FA) {
        double[] FactorAplicacion = new double[]{ 0.8,0.75,0.7,0.6,0.5}; 
        return FactorAplicacion[FA-1]; 
    }

    @Override
    public double FactorRugocidad(int FR) {
        double[] FactorRugocidad = new double[]{0.7,0.8,0.9}; 
        return FactorRugocidad[FR-1]; 
    }

    @Override
    public double Precios(int pre) {
        double[] precios = new double[]{ 20.0,25.9,30.9,50}; 
        return precios[pre-1];
    }

    @Override
    public String mensaje(double balde, String marca, String superficie, String metodo, double descuento, double monto) {
        String men="-------------Presupuesto de pintura-------------"+
                "\nBaldes necesarios: "+balde+
                "\nInstrumento: "+metodo+
                "\nSuperficie: "+superficie+
                "\nMarca: "+marca+
                "\nDescuento: "+descuento+" soles"+
                "\n"+
                "\n-------------------------------------------------"+
                "\nMonto a pagar: "+monto+" soles";
                
        return men;
    }

    @Override
    public double descuento(double balde,double presupuesto) {
        double desc;
        if (balde>=12){
            desc=0.10;
        }else{
            desc=0;
        }
        return desc*presupuesto;
    }

    @Override
    public double montoTotal(double presupuesto, double descuento) {
        return presupuesto-descuento;
    }
    

    
    
}
