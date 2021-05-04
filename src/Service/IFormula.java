package Service;

public interface IFormula {
    // Definiendo las operaciones
    double consumoTeorico(double area,double rendimiento);
    double consumoPractico(double CT, double FA,double FR);
    double presupeto(double balde,double precio);
    double FactorAplicacion(int FA);
    double FactorRugocidad(int FR);
    double Precios(int pre);
    String mensaje(double balde,String marca,String superficie,String metodo,double descuento,double monto);
    double descuento(double balde,double presupuesto);
    double montoTotal(double presupuesto, double descuento);
}
