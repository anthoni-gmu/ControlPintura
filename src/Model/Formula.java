package Model;

import Service.IFormula;

public class Formula  implements IFormula{

    @Override
    public double consumoTeorico(double area, double rendimiento) {
        return (area/rendimiento);
    }

    @Override
    public double consumoPractico(double area, double rendimiento, double fCorrecion) {
        return (consumoTeorico(area,rendimiento) * fCorrecion);
    }

    @Override
    public double presupeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
