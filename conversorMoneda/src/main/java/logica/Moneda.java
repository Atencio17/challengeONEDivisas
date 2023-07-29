
package logica;

public class Moneda {
    private final double TRM;
    private final double valorPeso;

    public Moneda(double TRM, double valorPeso) {
        this.TRM = TRM;
        this.valorPeso = valorPeso;
    }
    
    public double convertirMoneda(double cantidad, Moneda moneda){
        return cantidad * moneda.valorPeso;
    }
    
    public double revertirMoneda(double cantidad, Moneda moneda){
        return cantidad * moneda.TRM;
    }
}
