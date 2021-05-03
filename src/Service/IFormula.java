package Service;

public interface IFormula {
    // Definiendo las operaciones
    double consumoTeorico(double area,double rendimiento);
    double consumoPractico(double area, double rendimiento, double fCorrecion);
    double presupeto();
}
