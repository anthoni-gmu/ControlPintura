
package Model;

public class Resultado {
    double balde,descuento ,monto;
    String marca,superficie, metodo ;

    public Resultado() {
    }

    public Resultado(double balde, double descuento, double monto, String marca, String superficie, String metodo) {
        this.balde = balde;
        this.descuento = descuento;
        this.monto = monto;
        this.marca = marca;
        this.superficie = superficie;
        this.metodo = metodo;
    }

    public double getBalde() {
        return balde;
    }

    public void setBalde(double balde) {
        this.balde = balde;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
}
